package accenture_interview.coding_questions;

public class ReplaceCharactersInString {

	public static String replace(String str, char ch1, char ch2) {

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch1) {
				res.append(ch2);
			} else if (str.charAt(i) == ch2) {
				res.append(ch1);
			} else {
				res.append(str.charAt(i));
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {
//		String str = "hello world";
//		char ch1 = 'h';
//		char ch2 = 'w';
		
		
		String str = "apples";
		char ch1 = 'a';
		char ch2 = 'p';

		System.out.println("Original string : " + str);
		System.out.println("Replaced string : " + replace(str, ch1, ch2));
	}
}
