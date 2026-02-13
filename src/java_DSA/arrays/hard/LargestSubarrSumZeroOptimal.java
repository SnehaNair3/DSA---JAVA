package java_DSA.arrays.hard;

import java.util.HashMap;

public class LargestSubarrSumZeroOptimal {

	public static int findLargestSubarrSum0Optimal(int[] arr) {
		int sum = 0;
		int max = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum != 0) {
				if (map.containsKey(sum)) {
					max = Math.max(max, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			} else {
				max = i + 1;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 6, -2, 2, -8, 1, 7, 4, -10 }; // 8

		System.out.println(findLargestSubarrSum0Optimal(arr));
	}
}
