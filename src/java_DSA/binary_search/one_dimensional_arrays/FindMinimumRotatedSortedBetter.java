package java_DSA.binary_search.one_dimensional_arrays;

public class FindMinimumRotatedSortedBetter {

	public static int findMin1(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int ans = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;

			// identify the sorted half
			// pick the minimum element
			// eliminate the sorted half

			// left half sorted
			if (nums[low] <= nums[mid]) {
				ans = Math.min(ans, nums[low]);
				low = mid + 1;
			}
			// right half sorted
			else {
				ans = Math.min(ans, nums[mid]);
				high = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 2, 3, 4, 5, 6 };

		System.out.println(findMin1(arr));
	}
}
