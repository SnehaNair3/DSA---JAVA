package java_DSA.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LinearSerach3 {

	public static List<Integer> allOcc(int[] arr, int target) {
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1, 4, 6 };

		//int target = 4;
		
		int target=6;

		System.out.println(allOcc(arr, target));
	}
}
