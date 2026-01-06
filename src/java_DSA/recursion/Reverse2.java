package java_DSA.recursion;

public class Reverse2 {

	public static void reverse2(int[] arr, int i, int n) {
		if (i >= n / 2) {
			return;
		}

		swap(arr, i, n - i - 1);

		reverse2(arr, i + 1, n);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 57, 78, 32, 13, 0, 54, 34, 93 };

		int n = arr.length;

		reverse2(arr, 0, n);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
