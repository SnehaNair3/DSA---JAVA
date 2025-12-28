package accenture_interview.coding_questions;

public class SecondLargestElement {

	public static int findSecLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		//int[] arr = { 45, 67, 89, 74, 35, 63, 13 };
		
		int[] arr = { -451, -670, -893, -741, -350, 63, -133 };

		System.out.println(findSecLargest(arr));
	}
}
