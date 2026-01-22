package java_DSA.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrElementsBySignBrute {

	public static int[] rearrangeBySignBrute(int[] nums) {
		int n = nums.length;

		List<Integer> pos = new ArrayList<Integer>();
		List<Integer> neg = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				pos.add(nums[i]);
			} else {
				neg.add(nums[i]);
			}
		}

		for (int i = 0; i < n / 2; i++) {
			nums[2 * i] = pos.get(i);
			nums[2 * i + 1] = neg.get(i);
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, -2, -5, 2, -4 };

		System.out.println(Arrays.toString(rearrangeBySignBrute(arr)));
	}
}
