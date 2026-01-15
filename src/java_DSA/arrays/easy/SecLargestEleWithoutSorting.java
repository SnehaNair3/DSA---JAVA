package java_DSA.arrays.easy;

public class SecLargestEleWithoutSorting {

	public static int findSecLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secLargest && arr[i] < largest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 101, 38, 129, 7, 1 };

		System.out.println(findSecLargest(arr));
	}
}
