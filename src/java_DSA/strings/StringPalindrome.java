package java_DSA.strings;

public class StringPalindrome {

	public static boolean checkPalindrome(String str) {
		str = str.toLowerCase();

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "Malayalam";

		if (checkPalindrome(s)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a palindrome.");
		}
	}
}
