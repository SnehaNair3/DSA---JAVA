package java_DSA.binary_search.one_dimensional_arrays;

public class FloorAndCeil {

	public static int findFloor(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] <= target) {
				ans =nums[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static int findCeil(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] >= target) {
				ans = nums[mid];
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 25;
		System.out.println("floor : "+findFloor(arr, target));

		System.out.println("ceil : "+findCeil(arr, target));
	}
}
