package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBetter {

	public static List<List<Integer>> findFourSumBetter(int[] nums, int target) {

		int n = nums.length;

		Set<List<Integer>> ans = new HashSet<List<Integer>>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				Set<Integer> set = new HashSet<Integer>();
				for (int k = j + 1; k < n; k++) {

					long fourth = (long) target - (nums[i] + nums[j] + nums[k]);

					if (set.contains((int) fourth)) {
						List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);

						Collections.sort(temp);

						ans.add(temp);

					}

					set.add(nums[k]);
				}
			}
		}
		return new ArrayList<List<Integer>>(ans);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		System.out.println(findFourSumBetter(arr, target));
	}
}
