package Wires.impl;

import Wires.ActualParameter;
import Wires.FormalParameter;
import Wires.Model;
import Wires.ModelType;
import Wires.WiresPackage;
import Wires.exep.MetamodelNotFoundException;
import Wires.exep.ResourceNotFoundException;
import Wires.exep.TypeNotFoundException;
import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;

public abstract class ActualParameterImpl extends TypedElementImpl implements
		ActualParameter {
	ASMModel model;
	ASMModel metamodel;
	ASMOclAny basicDataValue;
	String modelPath;

	public String getModelPath() {
		return this.modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	public ASMModel getModel() {
		return this.model;
	}

	public ASMModel getMetamodel() {
		return this.metamodel;
	}

	public ASMOclAny getBasicDataValue() {
		return this.basicDataValue;
	}

	public void setBasicDataValue(ASMOclAny newValue) {
		this.basicDataValue = newValue;
	}

	public void loadMetamodel() {
		AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlEMFModelHandler.getDefault("EMF");
		FormalParameter type = (FormalParameter) getType();
		if (type == null)
			throw new TypeNotFoundException(this);
		if (type.getTypeEl() == null) {
			throw new MetamodelNotFoundException(type);
		}
		String metamodelPath = type.getTypeEl().getPath();

		if ((type.getTypeEl().getPath() != null)
				&& (!type.getTypeEl().getPath().equals(""))) {
			URI metamodelResource = null;
			File f = new File(metamodelPath);
			if (!f.exists()) {
				throw new ResourceNotFoundException(type.getTypeEl());
			}
			metamodelResource = URI.createFileURI(metamodelPath);
			String mmName = type.getTypeName();
			this.metamodel = modelHandler.loadModel(mmName,
					modelHandler.getMof(), metamodelResource);
		} else {
			metamodelPath = ((ModelType) type.getTypeEl()).getUri();

			if ((metamodelPath != null) && (!metamodelPath.trim().equals(""))) {
				String mmName = ((FormalParameter) getType()).getTypeName();
				this.metamodel = modelHandler.loadModel(mmName,
						modelHandler.getMof(), "uri:" + metamodelPath);
			} else {
				String metamodelName = ((ModelType) ((FormalParameter) getType())
						.getTypeEl()).getName();

				EObject o = this;
				while (!(o instanceof WiresSpecificationImpl)) {
					o = o.eContainer();
				}

				Model m = ((WiresSpecificationImpl) o).getModelByName(metamodelName);
				if (m == null)
					throw new MetamodelNotFoundException(
							((FormalParameter) getType()).getTypeEl());
				String modelPath = m.getPath();
				URI modelResource = URI.createFileURI(modelPath);
				String modelName = m.getName();
				this.metamodel = modelHandler.loadModel(modelName,
						modelHandler.getMof(), modelResource);
			}
		}
	}

	protected EClass eStaticClass() {
		return WiresPackage.Literals.ACTUAL_PARAMETER;
	}
}
