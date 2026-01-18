package java_DSA.arrays.medium;

public class MaxSumSubArrPrint {

	public static void findMaxSumSubarr(int[] nums) {

		// maximum sum
		long max = Long.MIN_VALUE;

		// current sum of the subarray
		long sum = 0;

		// starting index of the current subarray
		int start = 0;

		// Indices of the maximum sum subarray
		int ansStart = -1, ansEnd = -1;

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			if (sum == 0) {
				start = i;
			}

			sum += nums[i];

			if (sum > max) {
				max = sum;
				ansStart = start;
				ansEnd = i;
			}

			if (sum < 0) {
				sum = 0;
			}

		}
		
		// printing the subarray
					System.out.print("[");
					for (int i = ansStart; i <= ansEnd; i++) {
			            System.out.print(nums[i] + " ");
			        }
					System.out.println("]");
					System.out.println("Maximum sum = " + max);
	}

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		findMaxSumSubarr(arr);
	}
}
