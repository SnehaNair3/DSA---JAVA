package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervalsOptimal {

	public static List<List<Integer>> mergeOverlappingOptimal(int[][] arr) {

		int n = arr.length;

		// Sort intervals based on start time
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
				ans.add(Arrays.asList(arr[i][0], arr[i][1]));
			} else {
				int lastEnd = ans.get(ans.size() - 1).get(1);
				ans.get(ans.size() - 1).set(1, Math.max(lastEnd, arr[i][1]));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		System.out.println(mergeOverlappingOptimal(intervals));
	}
}
