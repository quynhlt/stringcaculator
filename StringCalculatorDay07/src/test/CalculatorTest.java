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
}
