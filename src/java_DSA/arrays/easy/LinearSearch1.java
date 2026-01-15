package java_DSA.arrays.easy;

public class LinearSearch1 {

	public static int firstOcc(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1, 4, 6 };

		int target = 4;

		System.out.println(firstOcc(arr, target));
	}
}
