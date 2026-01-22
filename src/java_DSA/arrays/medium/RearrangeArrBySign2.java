package java_DSA.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrBySign2 {

	public static int[] rearrange2(int[] nums) {

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

		if (pos.size() > neg.size()) {
			for (int i = 0; i < neg.size(); i++) {
				nums[2 * i] = pos.get(i);
				nums[2 * i + 1] = neg.get(i);
			}

			int index = neg.size() * 2;
			for (int i = neg.size(); i < pos.size(); i++) {
				nums[index] = pos.get(i);
				index++;
			}

		} else {

			for (int i = 0; i < pos.size(); i++) {
				nums[2 * i] = pos.get(i);
				nums[2 * i + 1] = neg.get(i);
			}

			int index = pos.size() * 2;
			for (int i = pos.size(); i < neg.size(); i++) {
				nums[index] = neg.get(i);
				index++;
			}
		}

		return nums;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, -4, -5, 3, 6 };

		int[] arr = { -1, 2, 3, 4, -3, 1 };

		System.out.println(Arrays.toString(rearrange2(arr)));
	}
}
