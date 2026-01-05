package java_DSA.patterns.star_patterns;

public class Pattern9 {

	public static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern9(5);
	}
}
