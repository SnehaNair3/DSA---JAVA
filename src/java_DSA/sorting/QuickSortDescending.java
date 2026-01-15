package java_DSA.sorting;

public class QuickSortDescending {

	public static void quickSortDesc(int[] arr, int low, int high) {
		// base case
		if (low < high) {
			// find partition index
			int pivotIndex = partition(arr, low, high);

			// sort left subarray
			quickSortDesc(arr, low, pivotIndex - 1);

			// sort right subarray
			quickSortDesc(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = low;
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] >= arr[pivot] && i <= high - 1) {
				i++;
			}

			while (arr[j] <= arr[pivot] && j >= low + 1) {
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
		//int[] arr = { 10, 7, 8, 9, 1, 5 };
		int[] arr = { 101, 7, 38, 129, 1, 15 };

		quickSortDesc(arr, 0, arr.length - 1);

		System.out.println("Arr after sorting in descending order : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
