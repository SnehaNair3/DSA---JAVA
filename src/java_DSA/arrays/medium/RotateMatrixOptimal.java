package java_DSA.arrays.medium;

public class RotateMatrixOptimal {

	public static void rotateClockwise(int[][] matrix) {
		int n = matrix.length;

		// step 1 : Transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// swap element at (i,j) with (j,i)
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// step 2 : reverse each row
		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;

			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		rotateClockwise(matrix);

		for (int[] row : matrix) {
			for (int val : row) {
				System.out.print(val + "  ");
			}
			System.out.println();
		}
	}
}
