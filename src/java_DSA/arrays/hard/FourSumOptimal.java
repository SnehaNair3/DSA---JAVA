package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumOptimal {

	public static List<List<Integer>> findFourSumOptimal(int[] nums, int target) {
		int n = nums.length;

		Set<Integer> set = new HashSet<Integer>();

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < n; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = n - 1;

				while (left < right) {
					long sum = nums[i] + nums[j] + nums[left] + nums[right];

					if ((int) sum == target) {
						ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;

						while (left < right && nums[left] == nums[left - 1]) {
							left++;
						}

						while (left < right && nums[right] == nums[right + 1]) {
							right--;
						}
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		System.out.println(findFourSumOptimal(arr, target));
	}

}
