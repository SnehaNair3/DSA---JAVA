package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBetter {

	public static List<List<Integer>> findThreeSumBetter(int[] nums) {
		int n = nums.length;

		Set<List<Integer>> ans = new HashSet<List<Integer>>();

		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int third = -(nums[i] + nums[j]);

				if (set.contains(third)) {
					List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
					Collections.sort(temp);
					ans.add(temp);
				}

				set.add(nums[j]);
			}
		}

		return new ArrayList<List<Integer>>(ans);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println(findThreeSumBetter(arr));
	}
}
