package java_DSA.patterns.star_patterns;

public class SquareHollow {

	public static void printPattern(int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		printPattern(5);
	}
}
