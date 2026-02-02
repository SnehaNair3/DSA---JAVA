package java_DSA.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class SubArrXorKOptimal {

	public static int findSubArrXorCountOptimal(int[] nums, int target) {

		int n = nums.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		int prefixXor = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			prefixXor = prefixXor ^ nums[i];

			int required = prefixXor ^ target;

			if (map.containsKey(required)) {
				count = count + map.get(required);
			}

			map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;

		System.out.println(findSubArrXorCountOptimal(arr, k));
	}
}
