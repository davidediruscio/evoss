package Wires;

import org.eclipse.emf.ecore.EObject;

public abstract interface LibraryRef extends EObject
{
  public abstract Library getLibrary();

  public abstract void setLibrary(Library paramLibrary);

  public abstract String getName();

  public abstract void setName(String paramString);
}
