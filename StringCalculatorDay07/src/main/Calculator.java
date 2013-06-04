/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	private static final String COMMAS = ",";

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(COMMAS)) {
			String[] tokens = number.split(COMMAS);
			for (String token : tokens) {
				result += toInt(token);
			}
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
