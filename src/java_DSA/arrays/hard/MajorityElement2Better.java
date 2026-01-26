package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2Better {

	public static List<Integer> findMajElementBetter(int[] nums) {
		int n = nums.length;
		List<Integer> res = new ArrayList<Integer>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int min = Math.floorDiv(n, 3) + 1;

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

			if (map.get(nums[i]) == min) {
				res.add(nums[i]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };

		System.out.println(findMajElementBetter(arr));
	}
}
