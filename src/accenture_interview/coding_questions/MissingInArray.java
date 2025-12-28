package accenture_interview.coding_questions;

public class MissingInArray {

	public static int findMissing(int[] arr) {
		int xor = 0;

		int n = arr.length;

		for (int i = 0; i <= n+1; i++) {
			xor ^= i;
		}

		for (int i = 0; i < n; i++) {
			xor ^= arr[i];
		}

		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };

		System.out.println(findMissing(arr));
	}
}
