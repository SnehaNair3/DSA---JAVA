package java_DSA.arrays.prefix_Sum_Technique;

import java.util.ArrayList;

public class PrefixSumExample {

	public static ArrayList<Integer> prefixSum(int[] arr) {
		int n = arr.length;

		ArrayList<Integer> prefixSum = new ArrayList<Integer>();

		prefixSum.add(arr[0]);

		for (int i = 1; i < n; i++) {
			prefixSum.add(prefixSum.get(i - 1) + arr[i]);
		}

		return prefixSum;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50 };

		ArrayList<Integer> prefixSum = prefixSum(arr);

		for (int i : prefixSum) {
			System.out.print(i + " ");
		}

	}
}
