package java_DSA.strings;

public class RemoveVowels {

	public static void removeVowelsFromStr(String str) {

		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if ("AEIOUaeiou".indexOf(ch) == -1) {
				sb.append(ch);
			}
		}

		System.out.println("String with vowels removed : " + sb.toString());
	}

	public static void main(String[] args) {
		String str = "Java is a programming language";

		System.out.println("Original str is : " + str);

		removeVowelsFromStr(str);
	}
}
