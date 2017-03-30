package model;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.EditorPart;

import com.bbraun.commons.UtilEvent;
import com.bbraun.commons.UtilListenableProperty;
import com.bbraun.wings.common.ServersideInterfaceHelper;
import com.bbraun.wings.editor.commands.AbstractPlatformCommand.HostType;
import com.bbraun.wings.editor.editors.AbstractLabelProvider;
import com.bbraun.wings.editor.editors.CurrentLanguageChangeEvent;
import com.bbraun.wings.editor.editors.CurrentStyleChangeEvent;
import com.bbraun.wings.editor.editors.IEditorPlatform;
import com.bbraun.wings.editor.editors.IEditorPlatformCommandStack;
import com.bbraun.wings.editor.editors.IOpenModelManager;
import com.bbraun.wings.editor.editors.ModelChangeEvent;
import com.bbraun.wings.editor.editors.WidgetLibraryChangeEvent;
import com.bbraun.wings.editor.editors.WingsUISession;
import com.bbraun.wings.editor.emfbackref.WingsModel;
import com.bbraun.wings.editor.errormodel.IErrorModel;
import com.bbraun.wings.editor.images.ImageCache;
import com.bbraun.wings.editor.impl.TreeFilterType;
import com.bbraun.wings.model.languageeditor.Language;
import com.bbraun.wings.model.screeneditor.styles.Style;
import com.bbraun.wings.model.validation.framework.ValidatorStateHandler;

/**
 * 
 * @author kovamr56
 * 
 *         Dummy implementation to be used to create and run
 *         GenerateOldStyleModelCommand3.
 *
 */
public class EditorPlatformDummy implements IEditorPlatform {

	private WingsModel model;
	private TransactionalEditingDomain domain;

	public EditorPlatformDummy(WingsModel model) {
		this.domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		this.model = model;
	}

	@Override
	public boolean setSelectionDomain(List<EObject> selection, boolean openView) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<EObject> getDomainSelection() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IEditorPlatform getPlatform() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		throw new UnsupportedOperationException();
	}

	@Override
	public HostType getHostType() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getRootModel() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IEditorPlatformCommandStack getCommonCommandStack() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IEditorPlatformCommandStack getTrickyCommonCommandStack() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IEditorPlatformCommandStack getEditorPlatformCommandStack() {
		throw new UnsupportedOperationException();
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		return domain;
	}

	@Override
	public UtilEvent<ModelChangeEvent> getModelChangeEvent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public UtilEvent<WidgetLibraryChangeEvent> getWidgetLibraryChangeEvent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public UtilEvent<CurrentStyleChangeEvent> getCurrentStyleChangeEvent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public UtilEvent<CurrentLanguageChangeEvent> getCurrentLanguageChangeEvent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IErrorModel getErrorModel() {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractLabelProvider getGlobalLabelProvider() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void doSaveAs() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isDirty() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IOpenModelManager getOpenModelManager() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void closeEditorForModel(EObject elementToDelete) {
		System.out.println("closeEditorForModel called");
	}

	@Override
	public IFileEditorInput getEditorInput() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Style getCurrentStyle() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setCurrentLanguage(Language language) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Language getCurrentLanguage() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setCurrentStyle(Style currentStyle) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Display getDisplay() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean getReadOnly() {
		return false;
	}

	@Override
	public String getVersionString() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getModelVersionString() {
		throw new UnsupportedOperationException();
	}

	@Override
	public WingsModel getModel() {
		return this.model;
	}

	@Override
	public EditorPart getEditorPart() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getGlobalAdapter(Class<?> type) {
		throw new UnsupportedOperationException();
	}

	@Override
	public GLCanvas createGLCanvas() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ServersideInterfaceHelper createServersideInterfaceHelper() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ImageCache getImageCache() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void importFile(IFile file) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public WingsUISession getSession() {
		throw new UnsupportedOperationException();
	}

	@Override
	public UtilListenableProperty<TreeFilterType> getTreeFilterTypeProperty() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ValidatorStateHandler getValidatorStateHandler() {
		throw new UnsupportedOperationException();
	}

}
