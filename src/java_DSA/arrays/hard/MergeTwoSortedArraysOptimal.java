package java_DSA.arrays.hard;

import java.util.Arrays;

public class MergeTwoSortedArraysOptimal {

	public static void mergeOptimal1(long[] arr1, long[] arr2, int n, int m) {

		int left = n - 1;
		int right = 0;

		while (left >= 0 && right < m) {
			if (arr1[left] > arr2[right]) {

				// swap
				long temp = arr1[left];
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

		long[] arr1 = { -5, -2, 4, 5, 0, 0, 0 };
		long[] arr2 = { -3, 1, 8 };

		int n = 4;
		int m = 3;

		mergeOptimal1(arr1, arr2, n, m);

		System.out.print("[");
		for (long num : arr1) {
			System.out.print(num + " ");
		}
		System.out.print("]");

		System.out.print("[");
		for (long num : arr2) {
			System.out.print(num + " ");
		}
		System.out.print("]");
	}
}
