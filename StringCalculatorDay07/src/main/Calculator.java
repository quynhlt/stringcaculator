/**
 * 
 */
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private static final int MAXVALUE = 1000;
	private static final String REGEX_DEFAULT_LENGTH = "//(.)\n(.*)";
	private static final String REGEX_ANY_LENGTH = "//\\[(.*)\\]\\n(.*)";

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
		String[] tokens = null;
		if (number.startsWith(SEPARATE)) {
			String newDelim = "";
			String newNumber = "";
			Matcher matcher = Pattern.compile(REGEX_DEFAULT_LENGTH).matcher(number);
			if (!matcher.find()) {
				matcher = Pattern.compile(REGEX_ANY_LENGTH).matcher(number);
				matcher.find();
			}
			newDelim = matcher.group(1);
			newNumber = matcher.group(2);
			tokens = newNumber.split(Pattern.quote(newDelim));
		} else {
			tokens = number.split(COMMAS + OR + NEWLINE);
		}
		return tokens;
	}

	private static int toInt(String number) {
		int newInt = Integer.parseInt(number);
		if (newInt < 0) {
			throw new RuntimeException(ERROR_MESSAGE);
		} else if (newInt > MAXVALUE) {
			newInt = 0;
		}
		return newInt;
	}

}
