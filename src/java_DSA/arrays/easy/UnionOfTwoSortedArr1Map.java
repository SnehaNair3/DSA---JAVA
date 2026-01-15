package java_DSA.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UnionOfTwoSortedArr1Map {

	public static List<Integer> findUnionMap(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		List<Integer> res = new ArrayList<Integer>();

		Map<Integer, Integer> freq = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < n1; i++) {
			freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
		}

		for (int j = 0; j < n2; j++) {
			freq.put(arr2[j], freq.getOrDefault(arr2[j], 0) + 1);
		}

		for (int key : freq.keySet()) {
			res.add(key);
		}

		return res;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = { 2, 3, 4, 4, 5 };

		System.out.println(findUnionMap(arr1, arr2));
	}
}
