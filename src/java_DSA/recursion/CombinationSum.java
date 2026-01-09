package java_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void findCombination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if (idx == arr.length) {
			if (target == 0) {
				ans.add(new ArrayList<Integer>(ds));
			}
			return;
		}

		if (arr[idx] <= target) {
			ds.add(arr[idx]);
			findCombination(idx, arr, target - arr[idx], ans, ds);

			ds.remove(ds.size() - 1);
		}

		findCombination(idx + 1, arr, target, ans, ds);

	}

	public static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		findCombination(0, arr, target, ans, new ArrayList<Integer>());

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };

		int target = 7;

		System.out.println(combinationSum(arr, target));

	}
}
