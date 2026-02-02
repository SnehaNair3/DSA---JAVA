package java_DSA.arrays.hard;

public class SubArrXorKBetter {

	public static int findSubArrXorCountBetter(int[] nums, int target) {

		int n = nums.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			int xor = 0;
			for (int j = i; j < n; j++) {
				xor = xor ^ nums[j];

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

		System.out.println(findSubArrXorCountBetter(arr, k));
	}
}
