package java_DSA.arrays.medium;

import java.util.HashMap;

//uses hashing
public class TwoSumBetter1 {

	public static boolean findTwoSumBetter1(int[] nums, int target) {
		int n = nums.length;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return true;
			} else {
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 6, 5, 8, 11 };
//		int target = 14;
		
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 15;

		System.out.println(findTwoSumBetter1(arr, target));
	}
}
