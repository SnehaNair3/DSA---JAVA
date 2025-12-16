package java_DSA.arrays.subArray_with_given_sum;

import java.util.HashMap;

public class SubArrayWithGivenSum3 {

	public static int subArrayCount(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int prefix = 0;
		int count = 0;

		map.put(0, 1);

		for (int i = 0; i < arr.length; i++) {
			prefix += arr[i];

			if (map.containsKey(prefix - sum)) {
				count += map.get(prefix - sum);
			}

			map.put(prefix, map.getOrDefault(prefix, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 12, -2, -20, 10 };

		int n = arr.length;
		int sum = -10;

		int count = subArrayCount(arr, n, sum);
		System.out.println("Number of subarrays : " + count);

	}
}
