package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBrute {

	public static List<List<Integer>> findThreeSumBrute(int[] nums) {

		int n = nums.length;
		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);

						// ensures only unique elements are stored each time
						Collections.sort(temp);
						set.add(temp);
					}
				}
			}
		}

		// Convert set to list
		return new ArrayList<List<Integer>>(set);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println(findThreeSumBrute(arr));
	}
}
