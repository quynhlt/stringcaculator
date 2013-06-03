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

			String[] tokens = getToken(number);
			for (String token : tokens) {
				result += toInt(token);
			}

		} else {
			result = toInt(number);
		}
		return result;
	}

	private static String[] getToken(String number) {
		return number.split(COMMAS);
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
