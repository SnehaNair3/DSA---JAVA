package accenture_interview.coding_questions;

import java.util.HashMap;

public class CountOccurenceOfEachElement {

	public static HashMap<Integer, Integer> countOccurence(int[] arr) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		return freq;
	}

	public static void main(String[] args) {
		//int[] arr = { 10, 2, 13, 11, 4, 2, 11, 5 };
		
		int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

		HashMap<Integer, Integer> res = countOccurence(arr);

		for (java.util.Map.Entry<Integer, Integer> e : res.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}
}
