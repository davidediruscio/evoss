package Wires;

import org.eclipse.emf.common.util.EList;

public abstract interface Library extends WiresElement
{
  public abstract String getName();

  public abstract void setName(String paramString);

  public abstract String getPath();

  public abstract void setPath(String paramString);

  public abstract EList<LibraryRef> getLibraries();
}
