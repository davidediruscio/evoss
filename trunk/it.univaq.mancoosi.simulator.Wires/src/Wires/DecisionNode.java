package Wires;

import org.eclipse.emf.common.util.EList;

public abstract interface DecisionNode extends WiresElement
{
  public abstract EList<Transformation> getTrueBranch();

  public abstract EList<Transformation> getFalseBranch();

  public abstract String getExpression();

  public abstract void setExpression(String paramString);

  public abstract EList<InputActualParameter> getInParams();
}
