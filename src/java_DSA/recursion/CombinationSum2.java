package java_DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	private static void findCombinations(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if (target == 0) {
			ans.add(new ArrayList<Integer>(ds));
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (i > idx && arr[i] == arr[i - 1]) {
				continue;
			}

			if (arr[i] > target) {
				break;
			}

			ds.add(arr[i]);
			findCombinations(i + 1, arr, target - arr[i], ans, ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr);

		findCombinations(0, arr, target, ans, new ArrayList<Integer>());
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2 };
		int target = 4;

		System.out.println(combinationSum(arr, target));
	}
}
