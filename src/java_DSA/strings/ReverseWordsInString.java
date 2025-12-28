package java_DSA.strings;

public class ReverseWordsInString {

	public static String reverse(String str) {
		String[] words = str.split(" ");

		String reversedString = "";

		for (int i = 0; i < words.length; i++) {
			String result = "";
			char ch;
			String word = words[i];
			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				result = ch + result;
			}
			reversedString = reversedString + result + " ";

		}
		return reversedString;

	}

	public static void main(String[] args) {
		String str = "Java is a programming language";

		String result = reverse(str);
		System.out.println("Original str is : " + str);
		System.out.println("Reversed str is : " + result);
	}
}
