package java_DSA.arrays.hard;

public class MergeTwoSortedArraysBrute {

	public static void mergeBrute(long[] arr1, long[] arr2, int n, int m) {
		long[] arr3 = new long[n + m];

		int left = 0;
		int right = 0;
		int index = 0;

		while (left < n && right < m) {
			if (arr1[left] <= arr2[right]) {
				arr3[index] = arr1[left];
				left++;
				index++;
			} else {
				arr3[index] = arr2[right];
				right++;
				index++;
			}
		}

		while (left < n) {
			arr3[index++] = arr1[left++];
		}

		while (right < m) {
			arr3[index++] = arr2[right++];
		}


		for (int i = 0; i < n + m; i++) {
			if (i < n) {
				arr1[i] = arr3[i];
			} else {
				arr2[i - n] = arr3[i];
			}
		}
	}

	public static void main(String[] args) {
		long[] arr1 = { -5, -2, 4, 5, 0, 0, 0 };
		long[] arr2 = { -3, 1, 8 };

		int n = 4;
		int m=3;

		mergeBrute(arr1, arr2, n, m);

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
