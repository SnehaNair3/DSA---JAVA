package accenture_interview.coding_questions;

public class StringPalindrome {

	public static boolean checkPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

	public static void main(String[] args) {
		//String s = "hannah";
		String s = "hello";
		

		System.out.println(checkPalindrome(s));
	}
}
