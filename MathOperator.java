package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public interface MathOperator {

//	void execute(Stack<BigDecimal> values);

	void execute(OperandStack stack);

}
