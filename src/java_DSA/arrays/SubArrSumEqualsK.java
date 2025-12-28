package java_DSA.arrays;

import java.util.HashMap;

public class SubArrSumEqualsK {

	public static int countSubArrSumK(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int count = 0;
		int prefix = 0;

		map.put(0, 1);

		for (int i = 0; i < arr.length; i++) {
			prefix += arr[i];

			if (map.containsKey(prefix - k)) {
				count += map.get(prefix - k);
			}

			map.put(prefix, map.getOrDefault(prefix, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -5, 5, -5, 1, 4 };

		int target = 5;

		int res = countSubArrSumK(nums, target);

		System.out.println("Count is : ");
		System.out.println(res);
	}
}
