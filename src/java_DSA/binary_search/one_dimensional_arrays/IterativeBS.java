package java_DSA.binary_search.one_dimensional_arrays;

public class IterativeBS {

	public static int findTarget1(int[] nums, int target) {
		int n = nums.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };
		int target = 12;

		System.out.println(findTarget1(arr, target));
	}
}
