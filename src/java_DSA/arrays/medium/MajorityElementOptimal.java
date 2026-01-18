package java_DSA.arrays.medium;

public class MajorityElementOptimal {

	public static int findMajorityOptimal(int[] nums) {
		int n = nums.length;

		// count variable
		int cnt = 0;

		// candidate element
		int el = 0;

		// step 1 : find the potential majority element
		for (int i = 0; i < n; i++) {
			if (cnt == 0) {
				cnt = 1;
				el = nums[i];
			} else if (nums[i] == el) {
				cnt++;
			} else {
				cnt--;
			}
		}

		// step 2 : verify the candidate
		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == el) {
				cnt1++;
			}
		}

		// return the element if its a majority
		if (cnt1 > n / 2) {
			return el;
		}

		// no majority found
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };

	//	int[] arr = { 2, 2, 3, 3, 1, 1, 2, 1, 1, 3, 1, 1, 1, 1 };

		System.out.println(findMajorityOptimal(arr));
	}
}
