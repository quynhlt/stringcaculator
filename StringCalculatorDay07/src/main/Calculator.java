/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(",")) {
			String[] tokens = number.split(",");
			result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

}
