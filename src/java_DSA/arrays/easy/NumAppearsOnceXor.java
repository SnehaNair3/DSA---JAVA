package java_DSA.arrays.easy;

public class NumAppearsOnceXor {

	public static int findNumOnceXor(int[] nums) {
		int xor = 0;

		for (int i = 0; i < nums.length; i++) {
			xor ^= nums[i];
		}

		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 3, 5, 5, 6, 6, 9, 4, 4 };

		System.out.println(findNumOnceXor(arr));
	}
}
