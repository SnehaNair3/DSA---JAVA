package accenture_interview.coding_questions;

import java.util.ArrayList;

public class MaxElementAndIndex {

	public static ArrayList<Integer> findMax(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				index = i;
			}
		}

		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(largest);
		res.add(index);

		return res;
	}

	public static void main(String[] args) {
		//int[] arr = { 1, 3, 5, 6, 7, 4 };
		
		int[] arr = { 1, 3, 5,7, 4 };


		System.out.println(findMax(arr));
	}
}
