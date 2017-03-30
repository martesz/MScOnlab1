package program;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.bbraun.wings.commonmemory.gen.model.GenerateOldStyleModelCommand3;
import com.bbraun.wings.editor.editors.IEditorPlatform;
import com.bbraun.wings.editor.emfbackref.WingsModel;
import com.bbraun.wings.editor.util.UtilModelIO;
import com.bbraun.wings.model.common.OperationMode;
import com.bbraun.wings.model.common.cmtype.CmAtomicTypeRegistry;
import com.bbraun.wings.model.common.cmtype.CmNamedType;
import com.bbraun.wings.model.common.cmtype.CmType;
import com.bbraun.wings.model.common.cmtype.CmTypeAtomic;
import com.bbraun.wings.model.common.cmval.CmValue;
import com.bbraun.wings.model.common.cmval.CmValueRegistry;
import com.bbraun.wings.model.common.cmval.impl.CmvalFactoryImpl;
import com.bbraun.wings.model.common.commonmemory.ValueRegistry;

import csv.CMVariable;
import csv.Reader;
import model.EditorPlatformDummy;

/**
 * 
 * @author kovamr56
 *
 *         Test application, that inserts new common memory entries, read from a
 *         CSV file, into a model file. First command line argument is the CSV
 *         file path, second is the Wings model file path. Third argument is the
 *         treatment mode.
 */
public class EditorApp {
	public static void main(String[] args) throws Exception {
		if (args.length > 2) {
			File csvFile = new File(args[0]);
			File modelFile = new File(args[1]);
			String mode = args[2];

			WingsModel model = UtilModelIO.loadSingleWingsModel(modelFile, true);

			OperationMode operationMode = null;
			for (OperationMode om : model.getValueRegistryCollection().getOperationModeCollection().getModes()) {
				if (om.getId().equals(mode)) {
					operationMode = om;
					break;
				}
			}

			List<CMVariable> newVariables = Reader.readCsv(csvFile);

			insertNewVariables(model, newVariables, operationMode);
			regenerateValueRegistry(model);

			ResourceSet resourceSet = model.getResourceSet();
			UtilModelIO.saveModel(resourceSet);
		}
	}

	/**
	 * Inserts the given list of new values into the flat value registry, if the
	 * values do not already exist in the model.
	 * 
	 * @param model
	 *            The model to be inserted into
	 * @param newVariables
	 *            The values to be inserted
	 */
	public static void insertNewVariables(WingsModel model, List<CMVariable> newVariables,
			OperationMode operationMode) {
		EList<CmNamedType> types = model.getTypeRegistry().getTypes();
		EList<CmValueRegistry> flatValueRegistries = model.getValueRegistryCollection().getFlatValueRegistries();
		CmAtomicTypeRegistry atomicTypeRegistry = model.getTypeRegistry().getAtomicTypeRegistry();
		CmValueRegistry flatValueRegistry = flatValueRegistries.get(0);

		for (CMVariable var : newVariables) {
			String newId = var.getSignalAttributeTRMTSignalDatabase().toLowerCase();
			CmValue existing = null;
			for (CmValue cmValue : flatValueRegistry.getValues()) {
				if (cmValue.getId().equals(newId)) {
					existing = cmValue;
					break;
				}
			}
			if (existing == null) {

				CmValue newValue = new CmvalFactoryImpl().createCmValue();
				newValue.setId(newId);
				newValue.getTargetModes().add(operationMode);
				CmType type = null;
				for (CmNamedType cnt : types) {
					if (cnt.getId().equals(var.getBBVariableType())) {
						type = cnt;
					}
				}
				if (type == null) {
					for (CmTypeAtomic cmTypeAtomic : atomicTypeRegistry.getTypes()) {
						if (cmTypeAtomic.getId().equals(var.getBBVariableType())) {
							type = cmTypeAtomic;
						}
					}
				}
				if (type != null) {
					newValue.setType(type);
					if (flatValueRegistries.size() > 0) {
						flatValueRegistry.getValues().add(newValue);
						System.out.println(newValue.getId() + " type: " + newValue.getType().getId() + " inserted");
					}
				} else {
					System.out.println(var.getBBVariableType() + " type does not exist in type registry");
				} // One exported CSV file contains variables for one mode
					// If the variable already exists add the new target mode
			} else if (existing.getTargetModes().contains(operationMode)) {
				System.out.println(
						newId + " with mode " + operationMode.getId() + " already exists in flat value registry");
			} else {
				existing.getTargetModes().add(operationMode);
				System.out.println(operationMode.getId() + " target mode added to " + existing.getId());
			}
		}

	}

	/**
	 * 
	 * @param model
	 *            The model containing the value registry
	 * 
	 *            Regenerates the value registry based on the updated flat value
	 *            registry
	 */
	public static void regenerateValueRegistry(WingsModel model) {
		EList<CmValueRegistry> flatValueRegistries = model.getValueRegistryCollection().getFlatValueRegistries();
		CmValueRegistry flatValueRegistry = flatValueRegistries.get(0);
		ValueRegistry valueRegistry = model.getValueRegistryCollection().getValueRegistries().get(0);
		IEditorPlatform editorPlatform = new EditorPlatformDummy(model);
		GenerateOldStyleModelCommand3 generateModelCommand = new GenerateOldStyleModelCommand3(editorPlatform,
				flatValueRegistry, valueRegistry);
		generateModelCommand.doRun();
		System.out.println("Value registry regenerated");
	}
}