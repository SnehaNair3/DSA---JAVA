package java_DSA.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUnsortedArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 7, 11, 15 };

		int target = 9;

		int[] result = twoSum(arr, target);
		System.out.println(Arrays.toString(result));

	}

	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(arr[i], i);
		}

		return new int[] { -1, -1 };
	}
}
