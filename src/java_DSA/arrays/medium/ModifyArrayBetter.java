package java_DSA.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class ModifyArrayBetter {

	public static int[] modifyArray2(int[] arr, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(n, -1));

		for (int i = 0; i < n; i++) {
			if (arr[i] != -1) {
				list.set(arr[i], arr[i]);
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = list.get(i);
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

		int n = arr.length;

		modifyArray2(arr, n);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
