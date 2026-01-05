package java_DSA.patterns.star_patterns;

public class Pattern8 {

	public static void pattern8(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 2 * i - 1; k > 0; k--) {
				System.out.print("*");
			}
//			for (int m = n - i; m > 0; m--) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern8(5);
	}
}
