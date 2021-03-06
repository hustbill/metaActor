package backtrack.csp;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a binary constraint which has equal values.
 * 
 */
public class EqualConstraint implements Constraint {

	private Variable var1;
	private Variable var2;
	private List<Variable> scope;

	public EqualConstraint(Variable var1, Variable var2) {
		this.var1 = var1;
		this.var2 = var2;
		scope = new ArrayList<Variable>(2);
		scope.add(var1);
		scope.add(var2);
	}

	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment assignment) {
		
		System.out.println(var1);
		Object value1 = assignment.getAssignment(var1);
		
		System.out.println(var2);
		System.out.println();
		//System.out.println(value1);
		Object value2 = assignment.getAssignment(var2);
		System.out.println(value2);
		
	
		//return value1 == null || value1.equals(assignment.getAssignment(var2));
		return value1.equals(assignment.getAssignment(var2));
	}
}
