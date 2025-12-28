package java_DSA.strings;

public class VowelsConsonants1 {

	public static void countVowelsConsonants(String str) {
		int vowels = 0;
		int consonants = 0;

		str = str.toLowerCase();

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

	public static void main(String[] args) {
		String str = "Java is a programming language";

		System.out.println("Original str is : " + str);

		countVowelsConsonants(str);
	}
}
