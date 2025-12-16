package java_DSA.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CountPaisWithGivenSumUnsorted {

	public static int countPairs(int[] nums, int target) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (freq.containsKey(target - nums[i])) {
				count += freq.get(target - nums[i]);
			}

			freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		// unsorted array
		int[] nums = { 1, 5, 7, -1, 5 };

		int target = 6;

		int res = countPairs(nums, target);

		System.out.println("Count is : ");
		System.out.println(res);
	}
}
