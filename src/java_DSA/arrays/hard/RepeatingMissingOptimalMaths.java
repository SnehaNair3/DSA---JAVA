package java_DSA.arrays.hard;

public class RepeatingMissingOptimalMaths {

	public static int[] findMissingRepeatingNumbersMaths(int[] nums) {
		long n = nums.length;

		// S-SN
		// S2-S2N

		long SN = (n * (n + 1)) / 2;
		long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

		long S = 0, S2 = 0;

		for (int i = 0; i < n; i++) {
			S += nums[i];
			S2 += (long) nums[i] * (long) nums[i];
		}

		long val1 = S - SN; // x-y
		long val2 = S2 - S2N;

		val2 = val2 / val1; // x+y

		long x = (val1 + val2) / 2;
		long y = x - val1;

		return new int[] { (int) x, (int) y };
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };

		int[] res = findMissingRepeatingNumbersMaths(arr);
		for (int num : res) {
			System.out.print(num + " ");
		}
	}
}
