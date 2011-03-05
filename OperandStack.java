package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {
	private Stack<BigDecimal> stack = new Stack<BigDecimal>();
	
	BigDecimal peek()
	{
		if(stack.isEmpty()) return BigDecimal.ZERO;
		return stack.peek();
	}
	
	void poke(BigDecimal value) {
		if (!stack.isEmpty()) 
			stack.push(stack.peek());
		stack.push(value);
	}

	public int size() {
		return stack.size();
	}

	public BigDecimal pop() {
		return stack.pop();
	}

	public void push(BigDecimal value) {
		stack.push(value);
	}
	
}