package accenture_interview.coding_questions;

public class MergeTwoSortedArrays {

	public static void mergeArrays(int[] a, int[] b) {

		int n = a.length;
		int m = b.length;

		int i = 0, j = 0;

		int[] merged = new int[n + m];

		int k = 0;

		while (i < n && j < m) {
			if (a[i] <= b[j]) {
				merged[k++] = a[i++];
			} else {
				merged[k++] = b[j++];
			}
		}

		while (i < n) {
			merged[k++] = a[i++];
		}

		while (j < m) {
			merged[k++] = b[j++];
		}

		for (i = 0; i < n; i++) {
			a[i] = merged[i];
		}

		for (j = 0; j < m; j++) {
			b[j] = merged[j + n];
		}

	}

	public static void main(String[] args) {
		//int[] a = { 2, 4, 7, 10 };
		//int[] b = { 2, 3 };
		
		int[] a = { 1, 5, 9, 10, 15, 20 };
		int[] b = { 2, 3, 8, 13 };

		mergeArrays(a, b);

		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : b) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
