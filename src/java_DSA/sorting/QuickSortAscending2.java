package java_DSA.sorting;

public class QuickSortAscending2 {

	public static void quickSortAsc2(int[] arr, int low, int high) {
		// base case
		if (low < high) {
			int pivotIndex = findPartition(arr, low, high);

			// sort left subarray
			quickSortAsc2(arr, low, pivotIndex - 1);

			// sort right subarray
			quickSortAsc2(arr, pivotIndex + 1, high);
		}
	}

	public static int findPartition(int[] arr, int low, int high) {
		int pivot = high;

		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= arr[pivot] && i <= high - 1) {
				i++;
			}

			while (arr[j] > arr[pivot] && j >= low + 1) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };

		quickSortAsc2(arr, 0, arr.length - 1);

		System.out.println("Arr after sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
