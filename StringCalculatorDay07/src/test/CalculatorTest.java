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

}
