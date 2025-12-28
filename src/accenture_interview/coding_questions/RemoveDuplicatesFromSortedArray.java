package accenture_interview.coding_questions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static List<Integer> removeFromSorted(int[] arr) {
		List<Integer> res = new ArrayList<Integer>();

		for (int num : arr) {
			if (!res.contains(num)) {
				res.add(num);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3,4,4,4,7,9,13 };

		System.out.println(removeFromSorted(arr));
	}
}
