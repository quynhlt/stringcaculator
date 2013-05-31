/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
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
}
// https://github.com/quynhlt/stringcaculator