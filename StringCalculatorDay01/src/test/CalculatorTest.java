package test;

import static org.junit.Assert.*;

import main.Caculator;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testReturnZeroOfEmptyString() {
		Caculator caculator = new Caculator();
		assertEquals(0, caculator.add(""));
	}

	@Test
	public void testReturnOfOneNumber() {
		Caculator caculator = new Caculator();
		assertEquals(1, caculator.add("1"));
	}

	@Test
	public void testReturnSumOfTwoNumberWithCommas() {
		Caculator caculator = new Caculator();
		assertEquals(3, caculator.add("1,2"));
	}

	@Test
	public void testReturnSumOfMultiNumberWithCommas() {
		Caculator caculator = new Caculator();
		assertEquals(15, caculator.add("1,2,3,4,5"));
	}
	
	@Test
	public void testReturnSumOfMultiNumberWithCommasAndNewlines() {
		Caculator caculator = new Caculator();
		assertEquals(6, caculator.add("1\n2,3"));
	}
	
}
