package accenture_interview.coding_questions;

import java.util.Arrays;

public class RemoveDuplicates2 {

	public static int remove(int[] arr) {
		int n = arr.length;

		Arrays.sort(arr);

		int i = 0; // index of last unique element

		for (int j = 1; j < n; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}

		return i + 1;
	}

	public static void main(String[] args) {
		//int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };
		
		int[] arr = { 10, 2, 13, 11, 4, 2, 11, 5 };
		int res = remove(arr);

		for (int i = 0; i < res; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
