package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervalsBrute {

	public static List<List<Integer>> mergeOverlappingBrute(int[][] arr) {

		int n = arr.length;

		// Sort intervals based on starting point
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);

		List<List<Integer>> ans = new ArrayList<>();

		// Loop through intervals
		for (int i = 0; i < n; i++) {

			int start = arr[i][0];
			int end = arr[i][1];

			// skip if current interval already covered
			if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
				continue;
			}

			// merge overlapping intervals
			for (int j = i + 1; j < n; j++) {
				if (arr[j][0] <= end) {
					end = Math.max(end, arr[j][1]);
				} else {
					break;
				}
			}

			// Add interval as List<Integer>
			List<Integer> interval = new ArrayList<>();
			interval.add(start);
			interval.add(end);

			ans.add(interval);
		}

		return ans;

	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		System.out.println(mergeOverlappingBrute(intervals));
	}
}
