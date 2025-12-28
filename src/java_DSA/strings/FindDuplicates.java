package java_DSA.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void findDuplicates(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				continue;
			}

			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		Set<Character> chars = map.keySet();

		System.out.println("Duplicate characters are : ");

		for (Character ch : chars) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		String str = "Learn java programming";

		findDuplicates(str);

	}
}
