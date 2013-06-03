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
		Calculator.add("//&\n1&2&3");
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

	private static String[] getToken(String number) {
		if (number.startsWith(SEPARATE)) {
			int start = SEPARATE.length();
			int end = number.indexOf(NEWLINE);
			String newDelim = number.substring(start, end);
			start = (SEPARATE + newDelim + NEWLINE).length();
			String newText = number.substring(start, number.length());
			System.out.println(newText);
			return newText.split(newDelim);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
