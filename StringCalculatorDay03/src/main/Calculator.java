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

	public int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(COMMAS)) {
			String[] numbers = getStringToken(number);
			int length = numbers.length;
			for (int i = 0; i < length; i++) {
				result += parseInt(numbers[i]);
			}
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

	private String[] getStringToken(String text) {
		if (text.startsWith(SEPARATE_LINE)) {
			/*int index = SEPARATE_LINE.length();
			String newDelimiter = text.substring(index, index + 1);
			String newText = text.replace(SEPARATE_LINE, "");
			return newText.split(newDelimiter);*/
			
            String newDelimiter = text.substring(2,3);
            String newText = text.substring(4);
           return newText.split(newDelimiter);
           
		} else {
			return text.split(COMMAS + OR + NEWLINE);
		}
	}

	private int parseInt(String text) {
		return Integer.parseInt(text);
	}
}
