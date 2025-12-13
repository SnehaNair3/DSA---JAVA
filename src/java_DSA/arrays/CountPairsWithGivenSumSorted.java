package java_DSA.arrays;

public class CountPairsWithGivenSumSorted {

	//do not handle duplicates..thats why count is 2.
	public static int countPairsSorted(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		int count = 0;

		while (left < right) {
			int sum = nums[left] + nums[right];

			if (sum == target) {
				count++;
				left++;
				right--;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] nums = { -1, 1, 5, 5, 7 };

		int target = 6;

		int res = countPairsSorted(nums, target);

		System.out.println("Count is : ");
		System.out.println(res);
	}
}
