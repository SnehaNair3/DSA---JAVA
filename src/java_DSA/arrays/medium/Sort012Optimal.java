package java_DSA.arrays.medium;

public class Sort012Optimal {

	public static void sortArrOptimal(int[] nums) {
		int low = 0, mid = 0, high = nums.length - 1;

		while (mid <= high) {
			if (nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 1, 0, 0, 2, 1, 0, 0, 1 };

		sortArrOptimal(arr);

		System.out.println("After sorting : ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
