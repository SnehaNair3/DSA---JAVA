package java_DSA.binary_search.one_dimensional_arrays;

public class SearchInsertPosition {

	public static int findInsertPos(int[] nums, int target) {
		int n = nums.length;
		int ans = n;
		int low = 0, high = n - 1;

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

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7 };
		int target = 6;

		System.out.println(findInsertPos(arr, target));
	}
}
