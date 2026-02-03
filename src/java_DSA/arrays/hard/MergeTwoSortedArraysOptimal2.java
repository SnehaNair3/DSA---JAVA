package java_DSA.arrays.hard;

public class MergeTwoSortedArraysOptimal2 {

	public static void swapIfGreater(int[] arr1, int[] arr2, int idx1, int idx2) {
		if (arr1[idx1] > arr2[idx2]) {
			int temp = arr1[idx1];
			arr1[idx1] = arr2[idx2];
			arr2[idx2] = temp;
		}
	}

	public static void mergeOptimal2(int[] arr1, int[] arr2, int n, int m) {

		int len = (n + m);
		int gap = (len / 2) + (len % 2);

		while (gap > 0) {
			int left = 0;
			int right = left + gap;
			while (right < len) {
				// arr1 and arr2
				if (left < n && right >= n) {
					swapIfGreater(arr1, arr2, left, right - n);
				}
				// arr2 and arr2
				else if (left >= n) {
					swapIfGreater(arr1, arr2, left - n, right - n);
				}
				// arr1 and arr1
				else {
					swapIfGreater(arr1, arr1, left, right);
				}
				left++;
				right++;
			}
			if (gap == 1) {
				break;
			}
			gap = (gap / 2) + (gap % 2);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { -5, -2, 4, 5, 0, 0, 0 };
		int[] arr2 = { -3, 1, 8 };

		int n = 4;
		int m = 3;

		mergeOptimal2(arr1, arr2, n, m);

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
