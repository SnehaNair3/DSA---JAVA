package java_DSA.arrays.medium;

public class PrintSubarrWithMaxSum {

	public static void findSubarrMaxSum(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		int start = 0;
		int ansStart = 0;
		int ansEnd = 0;

		for (int i = 0; i < nums.length; i++) {
			currSum += nums[i];

			if (currSum > maxSum) {
				maxSum = currSum;
				ansStart = start;
				ansEnd = i;

			}

			// currSum becomes negative
			if (currSum < 0) {
				currSum = 0;
				start = i + 1;
			}
		}

		System.out.println("Maximum sum subarray is : ");
		for (int i = ansStart; i <= ansEnd; i++) {
			System.out.print(nums[i] + " ");
		}

	}

	public static void main(String[] args) {
	//	int[] arr = { 2, 3, 5, -2, 7, -4 };
		
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		findSubarrMaxSum(arr);
	}
}
