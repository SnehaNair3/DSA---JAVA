package java_DSA.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static char FirstnonRepeating(String str) {
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> ele : map.entrySet()) {
			if (ele.getValue() == 1) {
				return ele.getKey();
			}
		}

		return '\0';

	}

	public static void main(String[] args) {
		String str = "java is a language";

		char res = FirstnonRepeating(str);
		System.out.println("First non-repeating char is : " + res);
	}
}
