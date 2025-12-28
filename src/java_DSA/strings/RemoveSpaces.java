package java_DSA.strings;

public class RemoveSpaces {

	public static String removeSpaces(String str) {
		return str.replaceAll("\\s", "");

	}

	public static void main(String[] args) {
		String str = "Java is a programming language";

		System.out.println("Original str is : " + str);

		String res = removeSpaces(str);
		System.out.println("String without spaces : " + res);
	}
}
