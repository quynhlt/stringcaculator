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
	public static final String ERROR_MESSAGE = "negatives not allowed";

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
			int start = SEPARATE.length();
			int end = number.indexOf(NEWLINE);
			String newDelim = number.substring(start, end);
			String newNumber = number.substring(end + 1, number.length());
			return newNumber.split(newDelim);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}

	private static int toInt(String number) {
		int newInt = Integer.parseInt(number);
		if (newInt < 0) {
			throw new RuntimeException(ERROR_MESSAGE);
		}else if (newInt > 1000) {
			newInt = 0;
		}
		return newInt;
	}

}
