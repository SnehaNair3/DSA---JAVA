package java_DSA.arrays.hard;

public class findMaxProdOptimal {

	public static int findMaxProdOptimal(int[] nums) {
		int n = nums.length;

		int pre = 1, suff = 1;

		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (pre == 0)
				pre = 1;
			if (suff == 0)
				suff = 1;

			pre *= nums[i];

			suff *= nums[n - i - 1];

			ans = Math.max(ans, Math.max(pre, suff));
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, -2, 4 };

		System.out.println(findMaxProdOptimal(arr));
	}
}
