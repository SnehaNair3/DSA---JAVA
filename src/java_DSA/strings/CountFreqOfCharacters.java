package java_DSA.strings;

public class CountFreqOfCharacters {

	public static void countFrequency(String str) {
		int[] freq = new int[26];

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				freq[ch - 'a']++;
			}
		}

		// print
		System.out.println("Characters are : ");
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Learn java programming";

		countFrequency(str);
	}
}
