package java_DSA.arrays.medium;

import java.util.Arrays;

public class TwoSumBrute2 {

	public static int[] findTwoSumBrute2(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 6, 5, 8, 11 };
//		int target = 14;
		
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 15;

		System.out.println(Arrays.toString(findTwoSumBrute2(arr, target)));

	}
}
