package sasken_coding;

import java.util.Scanner;

public class ReverseStringInPlace2 {

	public static String reverse2(String str) {
		// String reversed
		int left = 0;
		int right = str.length() - 1;
		char[] strArr = str.toCharArray();

		while (left < right) {
			char temp = strArr[left];
			strArr[left] = strArr[right];
			strArr[right] = temp;

			left++;
			right--;
		}
		return new String(strArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.print(reverse2(str));
	}
}
