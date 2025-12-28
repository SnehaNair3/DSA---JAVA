package accenture_interview.coding_questions;

public class BinaryOperationsOnString {

	public static String and(String str1, String str2) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {
				res.append('1');
			} else {
				res.append('0');
			}
		}

		return res.toString();
	}

	public static String or(String str1, String str2) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '1' || str2.charAt(i) == '1') {
				res.append('1');
			} else {
				res.append('0');
			}
		}

		return res.toString();
	}

	public static String xor(String str1, String str2) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				res.append('0');
			} else {
				res.append('1');
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {
		String str1 = "1011";
		String str2 = "0011";

		System.out.println("AND : " + and(str1, str2));
		System.out.println("OR : " + or(str1, str2));
		System.out.println("XOR : " + xor(str1, str2));
	}
}
