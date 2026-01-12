package java_DSA.sorting;

public class SelectionSort {

	public static void findSelectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minimum = i;

			for (int j = i; j < n; j++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;

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

		findSelectionSort(arr);
	}
}
