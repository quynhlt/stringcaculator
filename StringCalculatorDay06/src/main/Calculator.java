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
		Calculator.add("//;\n1;2");
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
		if (number.contains(SEPARATE)) {
			int start = SEPARATE.length();
			String newDelim = number.substring(start, start + 1);
			start = start + newDelim.length();
			String newText = number.substring(start, number.length());
			System.out.print(newDelim + "");
			return newText.split(newDelim);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
