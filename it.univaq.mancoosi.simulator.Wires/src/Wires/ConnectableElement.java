package Wires;

import org.eclipse.emf.common.util.EList;

public abstract interface ConnectableElement extends WiresElement
{
  public abstract EList<DataFlow> getIncoming();

  public abstract EList<DataFlow> getOutgoing();

  public abstract String getName();

  public abstract void setName(String paramString);
}
