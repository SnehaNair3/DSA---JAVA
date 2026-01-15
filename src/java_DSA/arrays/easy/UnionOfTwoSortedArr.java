package java_DSA.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArr {

	public static List<Integer> findUnion(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		List<Integer> union = new ArrayList<Integer>();

		int i = 0;
		int j = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			} else if (arr1[i] > arr2[j]) {
				if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			} else {
				// elements are equal.
				if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
				j++;
			}
		}

		// add remaining unique elements of arr1.
		while (i < n1) {
			if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}

		// add remaining unique elements of arr2.
		while (j < n2) {
			if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}

		return union;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = { 2, 3, 4, 4, 5 };

		System.out.println(findUnion(arr1, arr2));
	}
}
