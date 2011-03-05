package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public class RpnCalculator {

	private OperatorFactory factory;
//	private Stack<BigDecimal> values = new Stack<BigDecimal>();
	private OperandStack values = new OperandStack();
	
	public RpnCalculator()
	{
		factory = new OperatorFactory();
	}
	
	public BigDecimal getAccumulator() {
		if (values.size() > 0)  return values.peek();
		else  return BigDecimal.ZERO;
		}

	public void setAccumulator(BigDecimal value) {
		if (values.size() > 0)  values.pop();
			values.push(value);
	}

	public void enter() {
		values.push(getAccumulator());
	}

	public void drop() {
		if (values.size() > 0)  {
			values.pop();
		}
	}

	public void add() {
		//factory = new OperatorFactory();
		//factory.findOperator("+").execute(values);
		new Add().execute(values);
//		BigDecimal operand1 = BigDecimal.ZERO;
//		BigDecimal operand2 = BigDecimal.ZERO;
//		
//		if (values.size() > 0) operand1 = values.pop();
//		if (values.size() > 0) operand2 = values.pop();
//		
//		BigDecimal sum = operand1.add(operand2);
//		setAccumulator(sum);
	}

	public void subtract() {
		BigDecimal operand1 = BigDecimal.ZERO; 
		BigDecimal operand2 = BigDecimal.ZERO;
		
		if (values.size() > 0) operand1 = values.pop();
		if (values.size() > 0) operand2 = values.pop();
		
		BigDecimal difference = operand2.subtract(operand1);
		setAccumulator(difference);
	}

	public void fact(BigDecimal operand1) {
		BigDecimal result = new BigDecimal(1);
		while ( operand1.compareTo(BigDecimal.ZERO) > 0) {
			result = result.multiply(operand1);
			operand1 = operand1.subtract(new BigDecimal(1));
		}
		setAccumulator(result);
	}
	
	public void execute(String operator) {
		factory = new OperatorFactory();
		factory.findOperator(operator).execute(values);
		MathOperator op = null;
		// factory.findOperator(operator).execute(stack);
	
		// Previous incarnation (prior to factory)
//		if("+".equals(operator)) new Add().execute(values);
//		if("-".equals(operator)) subtract();
//		if("fact".equals(operator)) fact(getAccumulator());
//		else throw new IllegalArgumentException();
	}
	
	public void printStack() {
		OperandStack stackCopy = values;
		System.out.println(stackCopy.pop());
	}

}
