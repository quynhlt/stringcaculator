package main;

public class Caculator {
	private static final String COMMAS = ",";
	private static final String NEWLINES = "\n";

	public int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(COMMAS)) {
			String[] numbers = number.split(COMMAS + "|" + NEWLINES);
			int length = numbers.length;
			for (int i = 0; i < length; i++) {
				result += Integer.parseInt(numbers[i]);
			}
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}
}
