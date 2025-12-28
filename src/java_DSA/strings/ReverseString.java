package java_DSA.strings;

public class ReverseString {

	public static void reverseStr(String str) {
		char ch;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			result = ch + result;
		}

		System.out.println("Reversed str is : " + result);
	}

	public static void main(String[] args) {
		String str = "Java is a programming language";

		System.out.println("Original str is : " + str);
		reverseStr(str);

	}
}
