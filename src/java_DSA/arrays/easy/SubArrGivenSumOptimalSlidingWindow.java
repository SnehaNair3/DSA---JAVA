package java_DSA.arrays.easy;

//sliding window technique- works with positive numbers and zeroes only.
public class SubArrGivenSumOptimalSlidingWindow {

	public static int longestSubArrSlidingWindow(int[] nums, int k) {
		int sum = 0, maxLen = 0, left = 0;

		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];

			// case 1 : sum exceeds k
			while (sum > k && left <= right) {
				sum -= nums[left];
				left++;
			}

			// case 2 : check if sum equals k
			if (sum == k) {
				maxLen = Math.max(maxLen, right - left + 1);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
	//	int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
//		int[] arr = { 2, 0, 0, 3 };
//		int k = 3;
		
		int[] arr= {1,2,3,1,1,1,1,3,3};
		int k=6;

		System.out.println(longestSubArrSlidingWindow(arr, k));
	}
}
