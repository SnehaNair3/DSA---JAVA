package java_DSA.patterns.star_patterns;

public class Pattern6 {
	public static void pattern6(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern6(5);
	}
}
