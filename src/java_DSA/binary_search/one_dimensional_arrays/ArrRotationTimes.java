package java_DSA.binary_search.one_dimensional_arrays;

public class ArrRotationTimes {

	public static int findNoRotation(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[low] <= nums[high]) {
				if (nums[low] < ans) {
					ans = nums[low];
					index = low;
				}

				break;
			}

			// left half
			if (nums[low] <= nums[mid]) {
				if (nums[low] < ans) {
					ans = nums[low];
					index = low;
				}
				low = mid + 1;
			}
			// right half
			else {
				if (nums[mid] < ans) {
					ans = nums[mid];
					index = mid;
				}
				high = mid - 1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };

		System.out.println(findNoRotation(arr));
	}
}
