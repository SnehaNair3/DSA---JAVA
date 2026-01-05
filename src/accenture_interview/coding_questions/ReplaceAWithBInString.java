package accenture_interview.coding_questions;

public class ReplaceAWithBInString {

	public static String replace(String str) {
		StringBuilder res = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch == 'a') {
				res.append('b');
			} else {
				res.append(ch);
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {
//		String str = "alpha";
		String str = "banana";

		System.out.println(replace(str));
	}
}
