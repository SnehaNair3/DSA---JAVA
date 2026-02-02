package java_DSA.arrays.hard;

public class SubArrXorKBrute {

	public static int findSubArrXorCount(int[] nums, int target) {

		int n = nums.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int xor = 0;
				for (int k = i; k <= j; k++) {
					xor = xor ^ nums[k];
				}
				if (xor == target) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;

		System.out.println(findSubArrXorCount(arr, k));
	}
}
