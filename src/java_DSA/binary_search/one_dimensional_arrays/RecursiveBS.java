package java_DSA.binary_search.one_dimensional_arrays;

public class RecursiveBS {

	public static int findTarget2(int[] nums, int low, int high, int target) {
		// base case
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (target == nums[mid]) {
			return mid;
		} else if (target > nums[mid]) {
			return findTarget2(nums, mid + 1, high, target);
		}
		return findTarget2(nums, low, mid - 1, target);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };
		int target = 12;
		int n = arr.length;

		System.out.println(findTarget2(arr, 0, n - 1, target));
	}
}
