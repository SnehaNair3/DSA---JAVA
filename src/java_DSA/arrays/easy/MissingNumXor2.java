package java_DSA.arrays.easy;

public class MissingNumXor2 {

	public static int findMissingXor12(int[] nums) {
		int xor1 = 0, xor2 = 0;

		for (int i = 0; i < nums.length; i++) {
			xor2 = xor2 ^ nums[i];
			xor1 = xor1 ^ (i + 1);
		}
		xor1 = xor1 ^ nums.length + 1;

		return xor1 ^ xor2;
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };
		int[] arr = { 1, 2, 3, 4, 5,6, 7, 8, 9, 10, 11, 12 ,14,15,16};

		System.out.println(findMissingXor12(arr));
	}
}
