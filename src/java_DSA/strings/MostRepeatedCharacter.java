package java_DSA.strings;

import java.util.HashMap;

public class MostRepeatedCharacter {

	public static char findMostRepeated(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int maxCount = 0;
		char maxChar = '\0';

		for (char ch : str.toCharArray()) {

			if (ch == ' ') {
				continue;
			}
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : map.keySet()) {
			if (map.get(ch) > maxCount) {
				maxCount = map.get(ch);
				maxChar = ch;
			}

		}

		return maxChar;
	}

	public static void main(String[] args) {
		String str = "Learn java programming";
		//String str = "i miss you iiii hate you";

		char res = findMostRepeated(str);
		System.out.println("Most repeated char is : " + res);
	}
}
