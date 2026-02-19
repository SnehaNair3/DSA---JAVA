package java_DSA.binary_search.one_dimensional_arrays;
import java.util.Arrays;

public class FirstAndLastBetter {

	public static int findLb(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int ans = nums.length;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] >= target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int findUb(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int ans = nums.length;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] > target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int[] findFirstLast(int[] nums, int target) {
		int lb = findLb(nums, target);
		int ub = findUb(nums, target);

		if ((lb == nums.length) || (nums[lb] != target)) {
			return new int[] { -1, -1 };
		}

		return new int[] { lb, ub - 1 };
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };

	//	int target = 8;
		int target = 10;

		System.out.println(Arrays.toString(findFirstLast(arr, target)));
	}
}
