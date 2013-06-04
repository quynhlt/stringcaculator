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
			String regex = "//(.)\n(.*)";
			Matcher m = Pattern.compile(regex).matcher(number);
			if (m.find()) {
				String string1 = m.group(1);
				String string2 = m.group(2);
				tokens = string2.split(Pattern.quote(string1));
			} else {
				String regex2 = "//\\[(.*)\\]\\n(.*)";
				Matcher matcher2 = Pattern.compile(regex2).matcher(number);
				if (matcher2.find()) {
					String str1 = matcher2.group(1);
					String str = matcher2.group(2);
					tokens = str.split(Pattern.quote(str1));
				}
			}
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
