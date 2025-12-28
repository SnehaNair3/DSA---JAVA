package accenture_interview.coding_questions;

public class ReverseString1 {

	public static String reverse(String str) {
		char ch;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			result = ch + result;
		}

		return result;
	}

	public static void main(String[] args) {

		String str = "java is a programming language.";

		String res = reverse(str);
		System.out.println(res);
	}
}
