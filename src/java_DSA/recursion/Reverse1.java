package java_DSA.recursion;

public class Reverse1 {

	public static void reverse(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}

		swap(arr, start, end);

		reverse(arr, start + 1, end - 1);
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr = { 57, 78, 32, 13, 0, 54, 34, 93 };

		reverse(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
