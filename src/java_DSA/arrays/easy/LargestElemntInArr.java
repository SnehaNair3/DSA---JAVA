package java_DSA.arrays.easy;

public class LargestElemntInArr {

	public static int findLargest(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 101, 38, 129, 7, 1 };

		System.out.println(findLargest(arr));
	}
}
