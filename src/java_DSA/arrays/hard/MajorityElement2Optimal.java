package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Optimal {

	public static List<Integer> findMajElementOptimal(int[] nums) {
		int n = nums.length;

		int cnt1 = 0, cnt2 = 0;
		int el1 = Integer.MIN_VALUE;
		int el2 = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			if (cnt1 == 0 && nums[i] != el2) {
				cnt1 = 1;
				el1 = nums[i];

			} else if (cnt2 == 0 && nums[i] != el1) {
				cnt2 = 1;
				el2 = nums[i];
			} else if (el1 == nums[i]) {
				cnt1++;
			} else if (el2 == nums[i]) {
				cnt2++;
			} else {
				cnt1--;
				cnt2--;
			}
		}

		List<Integer> res = new ArrayList<Integer>();
		cnt1 = 0;
		cnt2 = 0;

		for (int i = 0; i < n; i++) {
			if (el1 == nums[i]) {
				cnt1++;
			}

			if (el2 == nums[i]) {
				cnt2++;
			}
		}

		int min = Math.floorDiv(n, 3) + 1;

		if (cnt1 >= min) {
			res.add(el1);
		}

		if (cnt2 >= min) {
			res.add(el2);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };

		System.out.println(findMajElementOptimal(arr));
	}
}
