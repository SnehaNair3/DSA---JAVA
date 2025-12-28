package java_DSA.strings;

public class Anagrams1 {

	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charCountMap = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCountMap[str1.charAt(i)]++;
			charCountMap[str2.charAt(i)]--;
		}

		for (int count : charCountMap) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String str1 = "listen man";
		String str2 = "silent man";

		if (areAnagrams(str1, str2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not anagrams");
		}
	}
}
