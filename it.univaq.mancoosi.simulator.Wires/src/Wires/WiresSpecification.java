package Wires;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public abstract interface WiresSpecification extends EObject
{
  public abstract EList<WiresElement> getEls();
}
