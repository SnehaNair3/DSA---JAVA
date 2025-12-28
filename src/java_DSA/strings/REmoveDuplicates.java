package java_DSA.strings;

public class REmoveDuplicates {

	public static void removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			
			if(ch == ' ') {
				continue;
			}
			if (sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}

		}

		System.out.println("String without duplicates : ");
		System.out.println(sb.toString());

	}

	public static void main(String[] args) {
		String str = "Learn java programming";

		removeDuplicates(str);
	}

}
