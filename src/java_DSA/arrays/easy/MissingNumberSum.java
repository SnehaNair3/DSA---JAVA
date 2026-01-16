package java_DSA.arrays.easy;

public class MissingNumberSum {

	public static int findMissingSum(int[] nums) {
		int originalSum = 0;
		int sum = 0;

		for (int i = 1; i <= nums.length + 1; i++) {
			originalSum += i;
		}

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return originalSum - sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };

		System.out.println(findMissingSum(arr));
	}
}
