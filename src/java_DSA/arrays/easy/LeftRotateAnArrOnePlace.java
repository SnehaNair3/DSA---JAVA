package java_DSA.arrays.easy;

public class LeftRotateAnArrOnePlace {

	public static void leftRotateOne(int[] arr) {
		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		leftRotateOne(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
