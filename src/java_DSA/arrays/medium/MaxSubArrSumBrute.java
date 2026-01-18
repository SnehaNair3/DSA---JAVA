package java_DSA.arrays.medium;

public class MaxSubArrSumBrute {

	public static int findMaxSumBrute(int[] nums) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int sum = 0;

				for (int k = i; k < j; k++) {
					sum += nums[k];
				}
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	public static void main(String[] args) {
	//	int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
	//	int[] arr= {2, 3, 5, -2, 7, -4};
		
		int[] arr= {-2, -3, -7, -2, -10, -4};

		System.out.println(findMaxSumBrute(arr));
	}
}
