package java_DSA.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetter {

	public static int findMajorityBetter(int[] nums) {
		int n = nums.length;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		// iterating the map
		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			int key = it.getKey();
			int count = it.getValue();

			if (count > n / 2) {
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 2, 3, 3, 1, 2, 2 };

		int[] arr = { 2, 2, 3, 3, 1, 1, 2, 1, 1, 3, 1, 1, 1, 1 };

		System.out.println(findMajorityBetter(arr));
	}
}
