package accenture_interview.coding_questions;

public class ReverseString2 {

	public static String reverse2(String str) {
		int start = 0;
		int end = str.length() - 1;

		char[] s = str.toCharArray();

		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;

			start++;
			end--;
		}

		return new String(s);
	}

	public static void main(String[] args) {

		String str = "java is a programming language.";

		String res = reverse2(str);
		System.out.println(res);
	}
}
