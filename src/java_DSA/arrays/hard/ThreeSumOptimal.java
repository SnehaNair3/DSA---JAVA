package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {

	public static List<List<Integer>> findThreeSumOptimal(int[] nums) {
		int n = nums.length;

		// sort the array
		Arrays.sort(nums);

		// store final result
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		// First loop for first element
		for (int i = 0; i < n; i++) {
			// skip duplicates for first element
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// Two pointers
			int left = i + 1;
			int right = n - 1;

			// Find pairs for current nums[i]
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;

					// skip duplicates for left
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					// skip duplicates for right
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				}

				else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println(findThreeSumOptimal(arr));
	}
}
