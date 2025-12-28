package java_DSA.arrays;

public class ElementsGreaterThanAverage {

	public static int greaterThanAverage(int[] arr) {
		int sum = 0;
		int avg = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			avg = sum / n;
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > avg) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8 };

		int res = greaterThanAverage(arr);

		System.out.println("No of elements greater than avg are : ");
		System.out.println(res);
	}
}
