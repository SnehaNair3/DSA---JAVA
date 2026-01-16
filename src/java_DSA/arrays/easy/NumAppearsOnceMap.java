package java_DSA.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class NumAppearsOnceMap {

	public static int findNumOnceMap(int[] nums) {
		int n = nums.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			int key = it.getKey();
			int count = it.getValue();

			if (count == 1) {
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };

		int[] arr = { 3, 3, 5, 5, 6, 6, 9, 4, 4 };

		System.out.println(findNumOnceMap(arr));
	}
}
