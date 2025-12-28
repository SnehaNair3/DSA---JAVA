package java_DSA.strings;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();

		int length = longestUniqueSubstring(str);
		System.out.println("Length of longest substring without repeating characters : " + length);
	}

	public static int longestUniqueSubstring(String s) {
		int left = 0, maxLen = 0;
		HashSet<Character> set = new HashSet<Character>();

		for (int right = 0; right < s.length(); right++) {
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}
}
