package java_DSA.arrays.easy;

public class SubArrGivenSumBrute {

	public static int longestSubArr1(int[] nums, int k) {
		int n = nums.length;

		int len = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];

				if (sum == k) {
					len = Math.max(len, (j - i + 1));
				}
			}

		}
		return len;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
		int k = 3;

		System.out.println(longestSubArr1(arr, k));
	}
}
