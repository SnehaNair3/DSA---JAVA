package java_DSA.arrays.hard;

import java.util.ArrayList;
import java.util.List;

import java_DSA.arrays.ArrayLeaders;

public class PascalTriangle3 {

	public static List<Integer> generateRow(int row) {

		int ans = 1;

		List<Integer> ansRow = new ArrayList<Integer>();

		ansRow.add(1);

		for (int col = 1; col < row; col++) {
			ans = ans * (row - col);
			ans = ans / (col);
			ansRow.add(ans);
		}
		return ansRow;

	}

	public static List<List<Integer>> generatePascalTriangle(int N) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();

		for (int i = 1; i <= N; i++) {
			res.add(generateRow(i));
		}

		return res;
	}

	public static void main(String[] args) {

		System.out.println(generatePascalTriangle(6));
	}
}
