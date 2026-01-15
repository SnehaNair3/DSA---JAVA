package java_DSA.sorting;

public class QuickSortAscending {

	public static void quickSortAsc(int[] arr, int low, int high) {
		// Base case
		if (low < high) {
			// find partition index
			int pivotIndex = partition(arr, low, high);

			// sort left subarray
			quickSortAsc(arr, low, pivotIndex - 1);

			// sort right subarray
			quickSortAsc(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = low;
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

		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };

		quickSortAsc(arr, 0, arr.length - 1);

		System.out.println("Arr after sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
