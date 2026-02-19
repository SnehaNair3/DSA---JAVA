package java_DSA.binary_search.one_dimensional_arrays;

public class SearchInRotatedSorted1Unique {

	public static int findTarget1(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// identify the sorted half

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
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
		int target = 1;

		System.out.println(findTarget1(arr, target));
	}
}
