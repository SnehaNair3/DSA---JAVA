package java_DSA.arrays.easy;

import java.util.HashMap;

//prefixSum + HashMap - works with positives,zeroes and negative numbers
public class SubArrGivenSumBetter {

	public static int longestSubArrHash(int[] nums, int k) {

		int n = nums.length;

		long sum = 0;
		int maxLen = 0;

		HashMap<Long, Integer> map = new HashMap<Long, Integer>();

		for (int i = 0; i < n; i++) {
			sum += nums[i];

			// case 1 : subarray from 0 to i
			if (sum == k) {
				maxLen = i + 1;
			}

			// case 2 : subarray exists ending at i
			if (map.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i - map.get(sum - k));
			}

			// store only first occurrence of sum
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };

		// int[] arr = { 2, 0, 0, 3 };

		int[] arr = { -1, 2, -1, 4, 3 };
		int k = 3;

		System.out.println(longestSubArrHash(arr, k));
	}
}
