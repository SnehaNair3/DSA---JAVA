package accenture_interview.coding_questions;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays1 {

	public static ArrayList<Integer> findIntersection(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : a) {
			set.add(num);
		}

		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int num : b) {
			if (set.contains(num)) {
				res.add(num);
				set.remove(num);
			}
		}

		return res;
	}

	public static void main(String[] args) {
//		int a[] = { 1, 2, 1, 3, 1 };
//		int b[] = { 3, 1, 3, 4, 1 };
		
		
		int a[] = { 1, 1,1 };
		int b[] = { 1,1,1,1,1};


		System.out.println(findIntersection(a, b));
	}
}
