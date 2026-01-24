package java_DSA.arrays.medium;

import java.util.HashMap;

public class SubarrSumEqualsK {

	public static int subarrSumK(int[] nums, int k) {

		int prefix = 0;
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			prefix += nums[i];

			if (map.containsKey(prefix - k)) {
				count += map.get(prefix - k);
			}

			map.put(prefix, map.getOrDefault(prefix, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 3;

		System.out.println(subarrSumK(nums, k));
	}
}
