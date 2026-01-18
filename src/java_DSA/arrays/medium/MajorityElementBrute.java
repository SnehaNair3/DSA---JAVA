package java_DSA.arrays.medium;

public class MajorityElementBrute {

	public static int findMajorityBrute(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (nums[j] == nums[i]) {
					count++;
				}
			}

			if (count > n / 2) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 1, 2, 2 };

		System.out.println(findMajorityBrute(arr));
	}
}
