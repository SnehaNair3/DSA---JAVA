package accenture_interview.coding_questions;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static LinkedHashSet<Integer> remove(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int num : arr) {
			set.add(num);
		}

		return set;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

		System.out.println(remove(arr));
	}
}
