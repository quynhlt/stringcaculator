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

	@Test
	public void testReturnOfMultiNumbersWithCommas() {
		assertEquals(4, Calculator.add("1,2,1"));
	}

	@Test
	public void testReturnOfNumbersWithCommasAndNewline() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testReturnOfOtherDelimiters() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testCallingAddWithANegativeNumber() {
		try {
			assertEquals(0, Calculator.add("-1,2"));
			fail();
		} catch (RuntimeException e) {
			assertEquals(Calculator.ERROR_MESSAGE, e.getMessage());
		}
	}

	@Test
	public void testReturnOfNumbersBiggerThan1000() {
		assertEquals(1, Calculator.add("1,1235"));
	}

	@Test
	public void testReturnOfDelimWithAnyLength() {
		assertEquals(3, Calculator.add("//[***]\n1***2"));
	}

	@Test
	public void testReturnOfMultipleDelimiter() {
		assertEquals(6, Calculator.add("//[*][%]\n1*2%3"));
	}
}
