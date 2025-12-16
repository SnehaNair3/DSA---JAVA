package java_DSA.stack;


//Two-pointers approach
public class CelebrityProblem1 {

	public static int celebrity(int[][] mat) {
		int n = mat.length;

		int i = 0, j = n - 1;

		while (i < j) {
			if (mat[i][j] == 1) {
				i++;
			} else {
				j--;
			}
		}

		int c = i;

		for (i = 0; i < n; i++) {

			if (i == c) {
				continue;
			}
			if (mat[i][c] == 0 || mat[c][i] != 0) {
				return -1;
			}
		}
		return c;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 1 } };
		System.out.println(celebrity(mat));
	}
}
