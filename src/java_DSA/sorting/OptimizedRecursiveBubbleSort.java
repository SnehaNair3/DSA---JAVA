package java_DSA.sorting;

public class OptimizedRecursiveBubbleSort {

	public static void optimizedRecBubbleSort(int[] arr, int n) {
		// base case
		if (n == 1)
			return;

		boolean didSwap = false;

		for (int j = 0; j <= n - 2; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				didSwap = true;
			}
		}

		if (!didSwap)
			return;

		optimizedRecBubbleSort(arr, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 13, 46, 24, 52, 20, 9 };
		int n = arr.length;

		System.out.println("Before Using Bubble Sort:");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		optimizedRecBubbleSort(arr, n);

		System.out.println("After Using Bubble Sort:");
		for (int i : arr)
			System.out.print(i + " ");
	}
}
