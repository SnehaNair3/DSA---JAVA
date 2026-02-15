package sasken_coding;

import java.util.Scanner;

public class ReverseStringInPlace {

	public static String reverse(String str) {
		String reversed = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reversed = ch + reversed;
		}
		return reversed;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(reverse(str));
	}
}
