package java_DSA.arrays.subArray_with_given_sum;

import java.util.ArrayList;

public class SubArrayWithGivenSum1 {

	public static ArrayList<Integer> subArrGivenSum(int[] arr, int target) {
		int s = 0, e = 0;

		ArrayList<Integer> res = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum >= target) {
				e = i;

				while (sum > target && s < e) {
					sum -= arr[s];
					++s;
				}

				if (sum == target) {
					res.add(s + 1);
					res.add(e + 1);
					return res;
				}
			}
		}

		res.add(-1);
		return res;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 15, 2, 4, 8, 9, 5, 10, 23 };

		int target = 23;

		ArrayList<Integer> res = subArrGivenSum(arr, target);

		for (Integer e : res) {
			System.out.print(e + " ");
		}
	}
}
