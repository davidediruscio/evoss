package Wires;

public abstract interface GenericQuery extends Query
{
  public abstract TypeParameter getTypeParam();

  public abstract void setTypeParam(TypeParameter paramTypeParameter);
}
