package java_DSA.arrays.medium;

public class TwoSumBrute {

	public static boolean findTwoSumBrute1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
	//	int[] arr = { 2, 6, 5, 8, 11 };
	//	int target = 14;
		
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 15;

		System.out.println(findTwoSumBrute1(arr, target));
	}
}
