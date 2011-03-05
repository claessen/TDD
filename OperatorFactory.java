package org.claessen.basicreview;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
	
	private Map<String, MathOperator> operators = new HashMap<String, MathOperator>();
	
	public OperatorFactory()
	{
		operators.put("+", new Add());
		operators.put("-", new Subtract());
		operators.put("!", new Factorial());
		operators.put("sum", new SumOperator());
	}
	
	public MathOperator findOperator(String operatorName)
	{
		MathOperator op = operators.get(operatorName);
		return op;
	}

}
