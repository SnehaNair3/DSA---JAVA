package java_DSA.arrays.medium;

public class Sort0s1s2sBetter {

	public static void sortArr(int[] nums) {

		int n = nums.length;
		int cnt0 = 0, cnt1 = 0, cnt3 = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				cnt0++;
			} else if (nums[i] == 1) {
				cnt1++;
			} else {
				cnt3++;
			}
		}

		for (int i = 0; i < cnt0; i++) {
			nums[i] = 0;
		}

		for (int i = cnt0; i < cnt0 + cnt1; i++) {
			nums[i] = 1;
		}

		for (int i = cnt0 + cnt1; i < n; i++) {
			nums[i] = 2;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 1, 0, 0, 2, 1, 0, 0, 1 };

		sortArr(arr);

		System.out.println("After sorting : ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
