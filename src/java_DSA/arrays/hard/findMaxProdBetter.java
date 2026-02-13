package java_DSA.arrays.hard;

public class findMaxProdBetter {

	public static int findMaxProdBetter(int[] nums) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int prod = 1;
			for (int j = i; j < nums.length; j++) {
				prod *= nums[j];
				max = Math.max(max, prod);
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, -2, 4 };

		System.out.println(findMaxProdBetter(arr));
	}
}
