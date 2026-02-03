package java_DSA.arrays.hard;

public class RepeatingMissingOptimalXOR {

	public static int[] findMissingRepeatingNumbersXor(int[] nums) {

		long n = nums.length;
		int xr = 0;

		for (int i = 0; i < n; i++) {
			xr = xr ^ nums[i];
			xr = xr ^ (i + 1);
		}

		int bitNo = 0;

		while (true) {
			if ((xr & (1 << bitNo)) != 0) {
				break;
			}
			bitNo++;
		}

		int zero = 0;
		int one = 0;
		for (int i = 0; i < n; i++) {
			// part of 1 club
			if ((nums[i] & (1 << bitNo)) != 0) {
				one = one ^ nums[i];
			}
			// part of zero club
			else {
				zero = zero ^ nums[i];
			}
		}

		for (int i = 1; i <= n; i++) {
			// part of 1 club
			if ((i & (1 << bitNo)) != 0) {
				one = one ^ i;
			}
			// part of zero club
			else {
				zero = zero ^ i;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == zero) {
				count++;
			}
		}

		if (count == 2) {
			return new int[] { zero, one };
		}

		return new int[] { one, zero };

	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };

		int[] res = findMissingRepeatingNumbersXor(arr);
		for (int num : res) {
			System.out.print(num + " ");
		}
	}
}
