package Wires;

import org.eclipse.emf.common.util.EList;

public abstract interface Transformation extends TypedElement
{
  public abstract EList<InputActualParameter> getInParams();

  public abstract EList<OutputActualParameter> getOutParams();

  public abstract DecisionNode getControlNode();

  public abstract void setControlNode(DecisionNode paramDecisionNode);
}
