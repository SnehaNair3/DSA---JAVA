package java_DSA.arrays.easy;

public class LeftRotateDPlaces {

	public static void leftRotateD(int[] arr, int d) {
		int n = arr.length;

		d %= n;

		reverse(arr, 0, d - 1);

		reverse(arr, d, n - 1);

		reverse(arr, 0, n - 1);
	}

	public static void rightRotateD(int[] arr, int d) {
		int n = arr.length;

		d %= n;

		reverse(arr, 0, n - 1);

		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// int d = 3;

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;
		leftRotateD(arr, d);
		System.out.println("Left rotate: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		int[] arr2 = { 1, 2, 3, 4, 5, 6,7 };
		int k = 2;
		rightRotateD(arr2, k);

		System.out.println("Right rotate : ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	}
}
