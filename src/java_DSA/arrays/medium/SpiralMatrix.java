package java_DSA.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List spiralOrder(int[][] matrix) {

		// Result List to store the spiral order
		List result = new ArrayList<Integer>();

		// Initialize boundaries
		int top = 0; // starting row
		int bottom = matrix.length - 1; // ending row
		int left = 0; // starting column
		int right = matrix[0].length - 1; // ending column

		// Loop until all elements are traversed
		while (top <= bottom && left <= right) {

			// traverse the top row from left to right
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			// traverse the right column from top to bottom
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// traverse the bottom row from right to left(only if rows remain)
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			// traverse the left column from bottom to top(only if columns remain)
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// Input matrix
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List ans = spiralOrder(matrix);

		System.out.println(ans);
	}
}
