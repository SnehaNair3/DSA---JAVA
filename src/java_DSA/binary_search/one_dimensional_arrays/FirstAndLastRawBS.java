package java_DSA.binary_search.one_dimensional_arrays;

import java.util.Arrays;

public class FirstAndLastRawBS {

	public static int findFirst(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int first = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				first = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return first;
	}

	public static int findLast(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int last = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				last = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return last;
	}

	public static int[] findFirstLastRawBs(int[] nums, int target) {
		int first = findFirst(nums, target);
		if (first == -1) {
			return new int[] { -1, -1 };
		}
		int last = findLast(nums, target);

		return new int[] { first, last };
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };

		int target = 8;
	//	int target = 10;

		System.out.println(Arrays.toString(findFirstLastRawBs(arr, target)));
	}
}
