package java_DSA.arrays.subArray_with_given_sum;

import java.util.HashMap;

public class SubArrayWithGivenSum2 {

	public static void subArraySum(int[] arr, int n, int sum) {
		int start = 0;
		int end = -1;
		int currSum = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			currSum += arr[i];

			if (currSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}

			if (map.containsKey(currSum - sum)) {
				start = map.get(currSum - sum) + 1;
				end = i;
				break;
			}

			map.put(currSum, i);
		}

		if (end == -1) {
			System.out.println("No subarray found with given sum.");
		} else {
			System.out.println("Sum found between indices : " + start + " and " + end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 12, -2, -20, 10 };

		int n = arr.length;
		int sum = -10;

		subArraySum(arr, n, sum);

	}
}
