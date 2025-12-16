package accenture_interview.coding_questions;

public class MaximumElementInArray {

	public static int findMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 67, 98, 13, 56, 1098 };

		System.out.println("MAX element : ");
		System.out.println(findMax(arr));
	}
}
