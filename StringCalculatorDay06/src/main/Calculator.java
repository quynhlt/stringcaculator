/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	public static int add(String string) {
		int result = 0;
		if (string.isEmpty()) {
			result = 0;
		}else{
			result = Integer.parseInt(string);
		}
		return result;
	}

}
