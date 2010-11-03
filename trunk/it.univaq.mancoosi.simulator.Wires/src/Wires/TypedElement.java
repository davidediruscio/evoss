package Wires;

public abstract interface TypedElement extends ConnectableElement
{
  public abstract Type getType();

  public abstract void setType(Type paramType);
}
