/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import main.Calculator;

import org.junit.Test;

/**
 * @author quynhlt
 * 
 */
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
	public void testReturnOfTwoNumberWithCommas() {
		assertEquals(3, Calculator.add("1,2"));
	}

	/* Allow the Add method to handle an unknown amount of numbers */
	@Test
	public void testReturnOfMultiNumbersWithCommas() {
		assertEquals(4, Calculator.add("1,2,1"));
	}

	/*
	 * Allow the Add method to handle new lines between numbers
	 * 
	 * (instead of commas).
	 */
	@Test
	public void testReturnOfNumbersWithCommasAndNewline() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testReturnOfDifferentDelimiters() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
	
	@Test
	public void testReturnOfOtherDelimiters() {
		assertEquals(3, Calculator.add("//&\n1&2"));
	}
	@Test
	public void testCallingAddWithANegativeNumber() {
		try {
			assertEquals(0, Calculator.add("-1,2"));
			fail("Runtime Exception");
		} catch (RuntimeException e) {
			assertEquals("Negatives not allowed", e.getMessage());
		}

	}
	@Test
	public void testReturnOfANumberBiggerThan1000() {
		assertEquals(2, Calculator.add("2,1111"));
	}
}
// https://github.com/quynhlt/stringcaculator