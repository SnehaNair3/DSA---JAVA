package accenture_interview.coding_questions;

import java.util.Arrays;

public class StringAnagrams2 {

	public static String checkAnagrams(String str1, String str2) {
		char[] x = str1.toLowerCase().toCharArray();

		char[] y = str2.toLowerCase().toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		return Arrays.equals(x, y) ? "yes" : "no";
	}

	public static void main(String[] args) {
//		String str1 = "listen man";
//		String str2 = "silent man";
		
		
		String str1 = "hello";
		String str2 = "hallo";


		System.out.println(checkAnagrams(str1, str2));
	}
}
