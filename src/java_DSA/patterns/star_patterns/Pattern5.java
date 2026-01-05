package java_DSA.patterns.star_patterns;

public class Pattern5 {
	public static void pattern5(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern5(4);
	}
}
