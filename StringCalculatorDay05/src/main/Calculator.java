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
		} else if (number.contains(COMMAS)) {
			String[] tokens = getToken(number);
			for (String token : tokens) {
				result += Integer.parseInt(token);
			}
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

	private static String[] getToken(String number) {
		return number.split(COMMAS);
	}
}
