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
	private static final String OR = "|";
	private static final String NEWLINE = "\n";
	private static final String SEPARATE = "//";

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

	private static String[] getToken(String number) {
		if (number.startsWith(SEPARATE)) {
			String newDelim = number.substring(2,3);
			String newNumber = number.substring(4,number.length());
			return newNumber.split(newDelim);
		}
		return number.split(COMMAS + OR + NEWLINE);
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
