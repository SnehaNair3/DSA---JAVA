package java_DSA.arrays.medium;

import java.util.Arrays;

public class FindTwoSumOptimal {

	public static boolean findTwoSumOptimal1(int[] nums, int target) {
		Arrays.sort(nums);

		int left = 0, right = nums.length - 1;

		while (left < right) {
			int sum = nums[left] + nums[right];

			if (sum == target) {
				return true;

			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 6, 5, 8, 11 };
//		int target = 14;

		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 20;

		System.out.println(findTwoSumOptimal1(arr, target));
	}
}