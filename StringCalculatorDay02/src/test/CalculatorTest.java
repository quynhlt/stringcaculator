/**
 * 
 */
package test;

import static org.junit.Assert.*;

import main.Calculator;

import org.junit.Test;

/**
 * @author quynhlt
 * 
 */
public class CalculatorTest {

	/* for an empty string method will return 0 */
	@Test
	public void testReturnOfEmptyString() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.add(""));
	}

	/* String is 1 or two numbers */
	@Test
	public void testReturnOfOneNumber() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testReturnOfTwoNumbersWithCommas() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add("1,2"));
	}

	/* Allow the Add method to handle an unknown amount of numbers */
	@Test
	public void testReturnOfMultiNumbersWithCommas() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.add("1,2,3"));
	}

	/*
	 * Allow the Add method to handle new lines between numbers (instead of
	 * commas).
	 */
	@Test
	public void testReturnOfMultiNumbersWithCommasAndNewlines() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.add("1,2,3\n4"));
	}

	@Test
	public void testReturnOfSupportMultiDelimiters() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add("//;\n1;2"));
	}
}
