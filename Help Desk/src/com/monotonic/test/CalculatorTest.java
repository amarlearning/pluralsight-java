package com.monotonic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monotonic.method.Calculator;

public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void shouldEvaluateConstant() {
		int result = calculator.evaluate("1");
		assertEquals(1, result);
	}
	
	@Test
	public void shouldEvaluateAddition() {
		int result = calculator.evaluate("1 + 2");
		assertEquals(3, result);
	}
	
	@Test
	public void shouldEvaluateSubstraction() {
		int result = calculator.evaluate("1 - 2");
		assertEquals(-1, result);
	}
	
	@Test
	public void shouldEvaluateComplexExpression() {
		int result = calculator.evaluate("1 + 2 - 3 + 4");
		assertEquals(4, result);
	}

}
