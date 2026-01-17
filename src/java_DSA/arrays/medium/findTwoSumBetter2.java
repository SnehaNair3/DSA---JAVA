package java_DSA.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class findTwoSumBetter2 {

	public static int[] findTwoSumBetter2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement) ,i};
			}
			map.put(nums[i], i);
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 6, 5, 8, 11 };
//		int target = 15;
		
		
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 14;

		System.out.println(Arrays.toString(findTwoSumBetter2(arr, target)));
	}
}
