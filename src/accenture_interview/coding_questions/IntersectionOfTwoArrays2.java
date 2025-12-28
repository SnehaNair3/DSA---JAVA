package accenture_interview.coding_questions;

import java.util.ArrayList;

public class IntersectionOfTwoArrays2 {

	public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {

		ArrayList<Integer> res = new ArrayList<Integer>();

		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
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

		int a[] = { 1, 1, 1 };
		int b[] = { 1, 1, 1, 1, 1 };

		System.out.println(findIntersection(a, b));
	}
}
