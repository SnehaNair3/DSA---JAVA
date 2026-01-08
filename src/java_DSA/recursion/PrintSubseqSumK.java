package java_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubseqSumK {

	public static void printSeqSumK(int idx, int[] arr, List<Integer> list, int n, int sum, int s) {

		if (idx == n) {
			if (s == sum) {
				System.out.println(list);
			}
			return;
		}

		list.add(arr[idx]);
		s += arr[idx];

		printSeqSumK(idx + 1, arr, list, n, sum, s);

		list.remove(list.size() - 1);
		s -= arr[idx];

		printSeqSumK(idx + 1, arr, list, n, sum, s);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };

		int n = arr.length;

		int sum = 2;

		List<Integer> list = new ArrayList<Integer>();

		printSeqSumK(0, arr, list, n, 2, 0);
	}
}
