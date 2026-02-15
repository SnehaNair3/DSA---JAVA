package sasken_coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
	public static char findFirst(String str) {
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			if (c.getValue() == 1) {
				return c.getKey();
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
	//	String str = "hello madam";
		String str = "java is a language";

		System.out.println(findFirst(str));
	}
}
