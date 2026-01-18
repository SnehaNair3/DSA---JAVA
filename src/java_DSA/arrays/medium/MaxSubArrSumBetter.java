package java_DSA.arrays.medium;

public class MaxSubArrSumBetter {

	public static int findMaxSumBetter(int[] nums) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];

				max = Math.max(max, sum);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, -2, 7, -4 };

		System.out.println(findMaxSumBetter(arr));
	}
}
