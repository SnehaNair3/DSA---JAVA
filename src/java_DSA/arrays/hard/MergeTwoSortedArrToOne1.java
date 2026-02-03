package java_DSA.arrays.hard;

import java.util.Arrays;

public class MergeTwoSortedArrToOne1 {

	public static void mergeSorted1(int[] arr1, int[] arr2, int n, int m) {

		int left = n - 1;
		int right = 0;

		while (left >= 0 && right < m) {
			if (arr1[left] > arr2[right]) {

				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;

				left--;
				right++;
			} else {
				break;
			}
		}

		Arrays.sort(arr1, 0, n);
		Arrays.sort(arr2, 0, m);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };

		int n = 4;
		int m = 5;

		mergeSorted1(arr1, arr2, n, m);

		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}

		for (int i = 0; i < m; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.print("]");
	}
}
