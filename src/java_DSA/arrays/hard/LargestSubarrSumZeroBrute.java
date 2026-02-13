package java_DSA.arrays.hard;

public class LargestSubarrSumZeroBrute {

	public static int findLargestSubarrSum0(int[] nums) {
		int n = nums.length;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];

				if (sum == 0) {
					cnt = Math.max(cnt, j - i + 1);
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
	//	int[] arr = { 9, -3, 3, -1, 6, -5 };  // 5
		
		int[] arr={6, -2, 2, -8, 1, 7, 4, -10}; //8

		System.out.println(findLargestSubarrSum0(arr));
	}
}
