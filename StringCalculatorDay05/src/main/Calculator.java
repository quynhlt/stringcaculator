/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		add("1,2");
	}

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if(number.contains(",")){
			String[] token = number.split(",");
			result = Integer.parseInt(token[0]) + Integer.parseInt(token[1]);
		} else{
			result = Integer.parseInt(number);
		}
		return result;
	}
}
