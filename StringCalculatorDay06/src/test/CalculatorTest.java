package test;

import static org.junit.Assert.*;

import main.Calculator;

import org.junit.Test;

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
	public void testReturnOfDifferentDelimiters() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testReturnOfOtherDelimiters() {
		assertEquals(6, Calculator.add("//&\n1&2&3"));
	}

	@Test
	public void testCallingAddWithANegativeNumber() {
		try {
			assertEquals(0, Calculator.add("-1,2"));
			fail("Exception");
		} catch (RuntimeException e) {
			assertEquals(Calculator.ERROR_RUNTIME, e.getMessage());
		}

	}

	@Test
	public void testReturnOfNumberBiggerThan1000() {
		assertEquals(1, Calculator.add("1,1212"));
	}

	@Test
	public void testReturnOfMultiNumbersBiggerThan1000() {
		assertEquals(1, Calculator.add("1,123123,123123"));
	}

	@Test
	public void testReturnOfDelimWithAnyLength() {
		assertEquals(3, Calculator.add("//[,,,]\n1,,,2"));
	}

	@Test
	public void testReturnOfMultipleDelimiter() {
		assertEquals(6, Calculator.add("//[*][%]\n1*2%3"));
	}
}
