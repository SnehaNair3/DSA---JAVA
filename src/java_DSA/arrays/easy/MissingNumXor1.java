package java_DSA.arrays.easy;

public class MissingNumXor1 {

	public static int findMissingXor1(int[] nums) {
		int res = 0;

		for (int i = 0; i <= nums.length+1; i++) {
			res ^= i;
		}

		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };

		System.out.println(findMissingXor1(arr));
	}
}
