package java_DSA.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqOfArrElements {

	public static List<List<Integer>> countFrequencies(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		List<List<Integer>> res = new ArrayList<>();
		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			List<Integer> pair = new ArrayList<>();
			pair.add(it.getKey());
			pair.add(it.getValue());

			res.add(pair);
		}

		return res;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 1, 3 };
		System.out.println(countFrequencies(nums));
	}
}
