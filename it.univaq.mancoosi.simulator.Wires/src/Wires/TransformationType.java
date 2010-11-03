package Wires;

import org.eclipse.emf.common.util.EList;

public abstract interface TransformationType extends Type
{
  public abstract EList<OutputFormalParameter> getOutParams();

  public abstract EList<LibraryRef> getLibraries();

  public abstract EList<InputFormalParameter> getInParams();
}
