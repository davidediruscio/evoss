package Wires;

public abstract interface DataFlow extends WiresElement
{
  public abstract ConnectableElement getTarget();

  public abstract void setTarget(ConnectableElement paramConnectableElement);

  public abstract ConnectableElement getSrc();

  public abstract void setSrc(ConnectableElement paramConnectableElement);
}
