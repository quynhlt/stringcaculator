/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(",")) {
			String[] tokens = number.split(",");
			result = toInt(tokens[0]) + toInt(tokens[1]);
		} else {
			result = toInt(number);
		}
		return result;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
