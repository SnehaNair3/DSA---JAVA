package accenture_interview.coding_questions;

public class StringAnagrams {

	public static String checkAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return "no";
		}

		int[] freq = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			freq[str1.charAt(i)]++;
			freq[str2.charAt(i)]--;
		}

		for (int count : freq) {
			if (count != 0) {
				return "no";
			}
		}
		return "yes";
	}

	public static void main(String[] args) {
//		String str1 = "silent";
//		String str2 = "listen";
		
		String str1 = "hello";
		String str2 = "hallo";

		System.out.println(checkAnagrams(str1, str2));
	}
}
