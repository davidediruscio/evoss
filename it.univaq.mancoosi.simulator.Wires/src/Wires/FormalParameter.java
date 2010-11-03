package Wires;

public abstract interface FormalParameter extends Type
{
  public abstract DataType getTypeEl();

  public abstract void setTypeEl(DataType paramDataType);

  public abstract String getTypeName();

  public abstract void setTypeName(String paramString);
}
