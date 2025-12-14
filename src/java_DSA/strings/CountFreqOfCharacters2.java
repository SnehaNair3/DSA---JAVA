package java_DSA.strings;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfCharacters2 {

	public static void countFrequency2(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			
			if(ch == ' ') {
				continue;
			}
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Learn java programming";

		countFrequency2(str);
	}
}
