package org.claessen.basicreview;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ANewlyCreatedRpnCalculatorShould { 
	private RpnCalculator calculator;

	@Before
	public void init() {
		calculator = new RpnCalculator();
	}
	
	
	@Test
	public void Have0InItsAccumulator() {
		assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
		
	}
	
	@Test
	public void AllowItsAccumulatorToBeSet() {
		BigDecimal value = new BigDecimal(42);
		calculator.setAccumulator(value);
		assertEquals(value,calculator.getAccumulator());
		
	}
	
	@Test
	public void HaveZeroInItsAccumulatorAfterASingleValueIsDropped() {
		BigDecimal value = new BigDecimal(10);
		calculator.setAccumulator(value);
		calculator.drop();
		assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
	}
	
	
	@Test
	public void AllowMultipleValuesToBeStored() {
		BigDecimal value = new BigDecimal(42);
		BigDecimal value2 = new BigDecimal(2);
		BigDecimal value3 = new BigDecimal(3);
		
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
		assertEquals(value3,calculator.getAccumulator());
		calculator.drop();
		assertEquals(value2,calculator.getAccumulator());
		calculator.drop();
		assertEquals(value,calculator.getAccumulator());
		calculator.drop();
		assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
		
	}
	
	@Test
	public void AllowMultipleDrops() {
		calculator.drop();
		calculator.drop();
		calculator.drop();
		calculator.drop();
		calculator.drop();
		calculator.drop();
		assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
	}
	
	@Test
	public void AddTwoNumbers() {
		BigDecimal value1 = new BigDecimal(42);
		BigDecimal value2 = new BigDecimal(2);
		BigDecimal sum = new BigDecimal(44);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.add();
		assertEquals(sum,calculator.getAccumulator());
	}
	
	@Test
	public void AddTwoNumbersEvenIfStackIsEmpty() {
		BigDecimal sum = new BigDecimal(0);
		calculator.add();
		assertEquals(sum,calculator.getAccumulator());
	}

	@Test
	public void SubtractTwoNumbers() {
		BigDecimal value1 = new BigDecimal(10);
		BigDecimal value2 = new BigDecimal(25);
		BigDecimal difference = new BigDecimal(-15);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.subtract();
		assertEquals(difference,calculator.getAccumulator());
	}

	@Test
	public void SubtractTwoNumbersEvenIfStackIsEmpty() {
		BigDecimal difference = new BigDecimal(0);
		calculator.subtract();
		assertEquals(difference,calculator.getAccumulator());
	}
	
	@Test
	public void CalculateFactorials() {
		BigDecimal value1 = new BigDecimal(5);
		BigDecimal result = new BigDecimal(120);
		calculator.fact(value1);	
		assertEquals(result,calculator.getAccumulator());
	}

		
	@Test
	public void sumItsStack() {
		calculator.setAccumulator(new BigDecimal(5));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(3));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(2));
		calculator.execute("sum");
		assertEquals(14, calculator.getAccumulator());
	}

	// Must modify so that there is another math operator
	// the CompositeMathOperator with append(MathOperator)
	// has a list of other MathOperators, when we call execute
	// it iterates through 
	// Composite Design Pattern
	@Ignore
	public void composeOperators()
	{
		calculator.startProgram();
		calculator.append("*");
		calculator.append("*");
		calculator.stopProgram();
		calculator.setAccumulator(new BigDecimal(5));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(3));
		calculator.run();
		
		assertEquals(17, calculator.getAccumulator());
		
	}
}