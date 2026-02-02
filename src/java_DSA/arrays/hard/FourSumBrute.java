package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBrute {

	public static List<List<Integer>> findFourSumBrute(int[] nums, int target) {

		int n = nums.length;

		Set<Integer> set = new HashSet<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						long sum = nums[i] + nums[j];
						sum += nums[k];
						sum += nums[l];

						if (sum == target) {
							List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);

							Collections.sort(temp);

							ans.add(temp);

						}
					}
				}
			}
		}
		return ans;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		System.out.println(findFourSumBrute(arr, target));
	}
}
