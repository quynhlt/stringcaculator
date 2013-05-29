package test;

import static org.junit.Assert.*;

import main.Calculator;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testReturnSumOfEmptyString() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void testReturnSumOfOneNumber() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testReturnSumOfTwoNumbersWithCommas() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
	public void testReturnSumOfMultiNumbersWithCommas() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.add("1,2,3"));
	}

	@Test
	public void testReturnSumOfMultiNumbersWithCommasAndNewline() {
		Calculator calculator = new Calculator();
		assertEquals(11, calculator.add("1,2,3\n4\n1"));
	}

	@Test
	public void testReturnSumOfSupportMultiDelimiters() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add("//;\n1;2"));
	}
}
