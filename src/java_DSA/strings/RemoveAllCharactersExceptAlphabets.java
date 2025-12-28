package java_DSA.strings;

public class RemoveAllCharactersExceptAlphabets {

	public static String removeExceptAlphabets(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "a1@b2#c3";

		System.out.println("Original str is : " + str);

		String res = removeExceptAlphabets(str);
		System.out.println("Str with only alphabets : " + res);
	}
}
