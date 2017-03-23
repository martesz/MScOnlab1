package program;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.bbraun.wings.editor.emfbackref.WingsModel;
import com.bbraun.wings.editor.util.UtilModelIO;
import com.bbraun.wings.model.common.cmtype.CmAtomicTypeRegistry;
import com.bbraun.wings.model.common.cmtype.CmNamedType;
import com.bbraun.wings.model.common.cmtype.CmType;
import com.bbraun.wings.model.common.cmtype.CmTypeAtomic;
import com.bbraun.wings.model.common.cmval.CmValue;
import com.bbraun.wings.model.common.cmval.CmValueRegistry;
import com.bbraun.wings.model.common.cmval.impl.CmvalFactoryImpl;
import com.bbraun.wings.model.common.commonmemory.ValueEntry;
import com.bbraun.wings.model.common.commonmemory.ValueRegistry;

import csv.CMVariable;
import csv.Reader;

/**
 * 
 * @author kovamr56
 *
 *         Test application that inserts new common memory entries into a model
 *         file.
 */
public class EditorApp {
	public static void main(String[] args) throws Exception {
		if (args.length > 1) {
			File csvFile = new File(args[0]);
			File modelFile = new File(args[1]);
			WingsModel model = UtilModelIO.loadSingleWingsModel(modelFile, true);

			EList<CmNamedType> types = model.getTypeRegistry().getTypes();
			EList<CmValueRegistry> flatValueRegistries = model.getValueRegistryCollection().getFlatValueRegistries();
			CmAtomicTypeRegistry atomicTypeRegistry = model.getTypeRegistry().getAtomicTypeRegistry();
			EList<ValueRegistry> valueRegistries = model.getValueRegistryCollection().getValueRegistries();
			Map<String, ValueEntry> entries = new HashMap<>();

			CmType tp = null;
			for (CmNamedType cnt : types) {

				if (cnt.getId().equals("STRING20_DESCR")) {
					tp = cnt;
				}
			}

			CmValue val = new CmvalFactoryImpl().createCmValue();
			val.setId("flat_teszt");
			val.setLoad(true);
			val.setDocumentation("flat value teszt");
			val.setType(tp);

			for (CmValueRegistry cvr : flatValueRegistries) {
				cvr.getValues().add(val);
				for (CmValue cmValue : cvr.getValues()) {
					System.out.println(cmValue);
				}
			}

			for (ValueRegistry vr : valueRegistries) {
				// vr.getValueEntries().add(ve);

				for (ValueEntry entry : vr.getValueEntries()) {
					entries.put(entry.getId(), entry);
				}
			}

			List<CMVariable> list = Reader.readCsv(csvFile);
			for (CMVariable cmv : list) {
				ValueEntry entry = entries.get(cmv.getSignalAttributeTRMTSignalDatabase());
				if (entry != null) {
					System.out.println(entry);
				}
			}
			ResourceSet resourceSet = model.getResourceSet();
			UtilModelIO.saveModel(resourceSet);
		}
	}

	/**
	 * Inserts the given list of new values into the flat value registry, if the
	 * values do not already exist in the model.
	 * 
	 * @param model
	 *            The model that we want to insert into
	 * @param newValues
	 *            The values to be inserted
	 */
	public void insertNewValues(WingsModel model, List<CMVariable> newValues) {
		EList<CmNamedType> types = model.getTypeRegistry().getTypes();
		EList<CmValueRegistry> flatValueRegistries = model.getValueRegistryCollection().getFlatValueRegistries();
		CmAtomicTypeRegistry atomicTypeRegistry = model.getTypeRegistry().getAtomicTypeRegistry();
		CmValueRegistry cmValueRegistry = flatValueRegistries.get(0);

		for (CMVariable var : newValues) {
			String newId = var.getSignalAttributeTRMTSignalDatabase().toLowerCase();
			CmValue existing = null;
			for (CmValue cmValue : cmValueRegistry.getValues()) {
				if (cmValue.getId().equals(newId)) {
					existing = cmValue;
					break;
				}
			}
			if (existing == null) {

				CmValue newValue = new CmvalFactoryImpl().createCmValue();
				newValue.setId(newId);
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

						cmValueRegistry.getValues().add(newValue);
					}
				} else {
					System.out.println(var.getBBVariableType() + " type does not exist in type registry");
				}
			} else {
				System.out.println(newId + " already exists in flat value registry");
			}
		}

	}
}