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
	private static final String NEWLINE = "\n";
	private static final String OR = "|";
	private static final String SEPARATE_LINE = "//";
	private static final int MAXNUMBER = 1000;

	public static void main(String[] args) {
		System.out.println("add= " + add("//;\n1;2"));
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
		if (number.startsWith(SEPARATE_LINE)) {
			int index = SEPARATE_LINE.length();
			int endIndex = number.indexOf(NEWLINE);
			String newDelimiter = number.substring(index, endIndex);
			index = (SEPARATE_LINE + newDelimiter + NEWLINE).length();
			String newText = number.substring(index, number.length());
			return newText.split(newDelimiter);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}

	private static int toInt(String number) {
		int newInt = Integer.parseInt(number);
		if (newInt < 0) {
			throw new RuntimeException("Negatives not allowed");
		} else if (newInt > MAXNUMBER) {
			newInt = 0;
		}
		return newInt;
	}

}
