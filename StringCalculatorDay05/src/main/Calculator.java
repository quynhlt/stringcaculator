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
		if (number.startsWith(SEPARATE)) {
			int startIndex = SEPARATE.length();
			
			String newDelim = number.substring(startIndex, startIndex+1);
			startIndex = (SEPARATE + newDelim + NEWLINE).length();
			String newText = number.substring(startIndex, number.length());
			return newText.split(newDelim);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}
}
