package java_DSA.arrays.easy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrSet {

	public static List<Integer> findUnionSet(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		Set<Integer> unique = new LinkedHashSet<Integer>();

		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < n1; i++) {
			unique.add(arr1[i]);
		}

		for (int j = 0; j < n2; j++) {
			unique.add(arr2[j]);
		}

		for (Integer val : unique) {
			res.add(val);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = { 2, 3, 4, 4, 5 };

		System.out.println(findUnionSet(arr1, arr2));
	}
}
