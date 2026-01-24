package java_DSA.arrays.medium;

import java.util.HashMap;

public class LongestSubarrSumK {

	public static int longestSubarray(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int prefixSum = 0;
		int maxLen = 0;

		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			// case 1 : subarray from 0 to i
			if (prefixSum == k) {
				maxLen = i + 1;
			}

			// case 2 : subarray from j+1 to i
			if (map.containsKey(prefixSum - k)) {
				maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
			}

			if (!map.containsKey(prefixSum - k)) {
				map.put(prefixSum, i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -1, 5, -2, 3 };
		int k = 3;

		System.out.println(longestSubarray(arr, k));
	}
}
