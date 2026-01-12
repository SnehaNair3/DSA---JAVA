package java_DSA.sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr, int n) {
		for (int i = 0; i <= n - 1; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}

		System.out.println("After sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 14, 9, 15, 12, 6, 8, 13 };

		System.out.println("Before sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		insertionSort(arr, arr.length);
	}
}
