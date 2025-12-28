package java_DSA.strings;

public class ToggleUpperTolower {

	public static void toggle(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(ch);
			}
		}

		System.out.println("Modified str in lower case : " + sb.toString());
	}

	public static void main(String[] args) {
		String str = "Java Is A Language";

		toggle(str);
	}
}
