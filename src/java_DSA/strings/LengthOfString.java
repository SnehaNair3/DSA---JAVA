package java_DSA.strings;

public class LengthOfString {

	public static int findLength(String str) {
		int count = 0;

		for (char ch : str.toCharArray()) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Java Is A Language";

		int res = findLength(str);
		System.out.println("String length : " + res);
	}
}
