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

	public static void main(String[] args) {
		add("1,2");
	}

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else {
			String[] tokens = getToken(number);
			for (String token : tokens) {
				result += toInt(token);
			}
		}
		return result;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static String[] getToken(String number) {
		return number.split(COMMAS + "|\n");
	}
}
