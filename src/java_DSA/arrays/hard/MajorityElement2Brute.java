package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Brute {

	public static List<Integer> findMajElementBrute(int[] nums) {
		int n = nums.length;
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (res.size() == 0 || res.get(0) != nums[i]) {
				int count = 0;

				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						count++;
					}
				}
				if (count > n / 3) {
					res.add(nums[i]);
				}
			}

			// stop when res list becomes 2 because max 2 elements only will be there.
			if (res.size() == 2) {
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };

		System.out.println(findMajElementBrute(arr));
	}
}
