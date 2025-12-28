package java_DSA.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams2 {

	public static void checkAnagrams(String str1, String str2) {
		char[] x = str1.replaceAll("//s", "").toLowerCase().toCharArray();

		char[] y = str2.replaceAll("//s", "").toLowerCase().toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println(Arrays.equals(x, y) ? "Anagrams" : "Not anagrams");
	}

	public static void main(String[] args) {
		String str1 = "listen man";
		String str2 = "silent mans";

		checkAnagrams(str1, str2);
	}
}
