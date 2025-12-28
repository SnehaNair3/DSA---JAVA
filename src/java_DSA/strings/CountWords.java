package java_DSA.strings;

public class CountWords {

	public static int countWords1(String str) {
		str = str.trim();

		String[] words = str.split("\\s+");

		return words.length;
	}

	public static void main(String[] args) {
		//String str = "java is a language";
		String str = "I love java programming and java is a powerful language.";

		int count = countWords1(str);
		System.out.println("Count : " + count);
	}
}
