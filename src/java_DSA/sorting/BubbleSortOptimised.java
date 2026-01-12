package java_DSA.sorting;

public class BubbleSortOptimised {

	public static void OptimalBubbleSort(int[] arr, int n) {
		for (int i = n - 1; i >= 1; i--) {
			boolean didSwap = false;

			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					didSwap = true;
				}
			}
			if (!didSwap) {
				break;
			}
		}

		System.out.println("After sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 13, 46, 24, 52, 20, 9 };
		System.out.println("Before sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		OptimalBubbleSort(arr, arr.length);
	}
}
