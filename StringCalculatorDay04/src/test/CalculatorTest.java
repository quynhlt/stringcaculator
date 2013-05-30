package test;

import static org.junit.Assert.*;

import main.Calculator;

import org.junit.Test;

public class CalculatorTest {
	/*
	 * The method can take 0, 1 or 2 numbers, and will return their sum (for an
	 * empty string it will return 0) for example “” or “1” or “1,2”
	 */
	@Test
	public void testReturnOfEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testReturnOfOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testReturnOfTwoNumbersWithCommas() {
		assertEquals(3, Calculator.add("1,2"));
	}

	/* Allow the Add method to handle an unknown amount of numbers */
	@Test
	public void testReturnOfMultiNumbersWithCommas() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	/*
	 * Allow the Add method to handle new lines between numbers (instead of
	 * commas).
	 */
	@Test
	public void testReturnOfNumbersWithCommasAndNewline() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	/* Support different delimiters */
	@Test
	public void testReturnOfDifferentDelimiters() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	/*
	 * The first line is optional.
	 * 
	 * All existing scenarios should still be supported
	 */
	@Test
	public void testReturnOfOtherDelimiters() {
		assertEquals(15, Calculator.add("//&\n1&2&3&4&5"));
	}

	/*
	 * Calling Add with a negative number will throw an exception
	 * 
	 * “negatives not allowed” - and the negative that was passed.
	 */
	@Test
	public void testCallingAddWithANegativeNumber() {
		try {
			assertEquals(0, Calculator.add("-1,2,3"));
			fail("Runtime Exception");
		} catch (RuntimeException e) {
			assertEquals("Negatives not allowed", e.getMessage());
		}

	}

	/*
	 * If there are multiple negatives, show all of them in the exception
	 * message
	 */
	@Test
	public void testCallingAddWithMultipleNegatives() {
		try {
			assertEquals(0, Calculator.add("//,\n-1,2,3,-4,-6"));
			fail("Runtime Exception");
		} catch (RuntimeException e) {
			assertEquals("Negatives not allowed", e.getMessage());
		}

	}

	/* Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2 */
	@Test
	public void testReturnOfANumberBiggerThan1000() {
		assertEquals(2, Calculator.add("2,1001"));
	}

	@Test
	public void testReturnOfMultiNumberBiggerThan1000() {
		assertEquals(2, Calculator.add("2,1001,1102,1245"));
	}

	@Test
	public void testReturnOfDelimitersWithAnyLength() {
		assertEquals(6, Calculator.add("//[***]\n1***2***3"));
	}
}
