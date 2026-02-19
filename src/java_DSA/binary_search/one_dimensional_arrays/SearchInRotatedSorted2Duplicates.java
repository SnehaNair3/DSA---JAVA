package java_DSA.binary_search.one_dimensional_arrays;

public class SearchInRotatedSorted2Duplicates {

	public static boolean findTarget2(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return true;
			}

			// edge case
			if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
				low = low + 1;
				high = high - 1;
				continue;
			}

			// left sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			// right sorted
			else {
				if (nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };

	//	int target = 3;
		int target = 10;

		System.out.println(findTarget2(arr, target));
	}
}
