package java_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubseqSumK {

	public static int countSubseqSumK(int idx, int[] arr, int n, int sum, int s) {
		
		
		//base condition- condition not satisfied
		//strictly done if arr contains positives only
		if( s > sum) {
			return 0;
		}
		
		if (idx == n) {
			if (s == sum) {
				return 1;
			}
			return 0;
		}

		s += arr[idx];

		int left = countSubseqSumK(idx + 1, arr, n, sum, s);

		s -= arr[idx];

		int right = countSubseqSumK(idx + 1, arr, n, sum, s);

		return left + right;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };

		int n = arr.length;

		int sum = 2;

		System.out.println(countSubseqSumK(0, arr, n, 2, 0));
	}
}
