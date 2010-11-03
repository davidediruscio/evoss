package Wires;

public abstract interface GenericTransformation extends AtomicModelTransformation
{
  public abstract TypeParameter getTypeParam();

  public abstract void setTypeParam(TypeParameter paramTypeParameter);
}
