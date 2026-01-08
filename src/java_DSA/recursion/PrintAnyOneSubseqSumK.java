package java_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAnyOneSubseqSumK {

	public static boolean printOneSeqSumK(int idx, int[] arr, List<Integer> list, int n, int sum, int s) {
		if (idx == n) {
			if (s == sum) {
				System.out.println(list);
				return true;
			}
			return false;
		}

		list.add(arr[idx]);
		s += arr[idx];

		if (printOneSeqSumK(idx + 1, arr, list, n, sum, s) == true) {
			return true;
		}

		list.remove(list.size() - 1);
		s -= arr[idx];

		if (printOneSeqSumK(idx + 1, arr, list, n, sum, s) == true) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };

		int n = arr.length;

		int sum = 2;

		List<Integer> list = new ArrayList<Integer>();

		printOneSeqSumK(0, arr, list, n, 2, 0);
	}
}
