package java_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

	public static void printSubseq(int idx, List<Integer> list, int[] arr, int n) {
		if (idx >= n) {
			System.out.println(list);
			return;
		}

		// take or pick the particular index element to the subsequence
		list.add(arr[idx]);

		printSubseq(idx + 1, list, arr, n);

		list.remove(list.size() - 1);

		// not take the element at the particular index to the subsequence
		printSubseq(idx + 1, list, arr, n);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };

		int n = arr.length;

		List<Integer> list = new ArrayList<Integer>();

		printSubseq(0, list, arr, n);
	}
}
