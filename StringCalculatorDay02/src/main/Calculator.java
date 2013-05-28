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
	private static final String NEWLINES = "\n";
	private static final String OR = "|";
	private static final String SEPARATE_LINE = "//";

	public int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(COMMAS)) {
			String[] numbers = getToken(number);
			int length = numbers.length;
			for (int i = 0; i < length; i++) {
				result += stringToInt(numbers[i]);
			}
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

	private String[] getToken(String string) {
		if (string.startsWith(SEPARATE_LINE)) {

		}
		return string.split(COMMAS + OR + NEWLINES);
	}

	private int stringToInt(String string) throws NumberFormatException {
		return Integer.parseInt(string);
	}
}
