package java_DSA.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArr {

	public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		List<Integer> res = new ArrayList<Integer>();

		int i = 0;
		int j = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr1[i]) {
				j++;
			} else {
				res.add(arr1[i]);
				i++;
				j++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 3, 5, 5, 8, 9 };

		int[] arr2 = { 3, 5, 8, 9, 6, 10, 7, 3 };

		System.out.println(findIntersection(arr1, arr2));
	}
}
