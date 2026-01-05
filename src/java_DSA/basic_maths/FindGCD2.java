package java_DSA.basic_maths;

public class FindGCD2 {

	public static int findGcd2(int a, int b) {
		int gcd = 0;

		for (int i = 1; i <= Math.min(a, b); i++) {
			if ((a % i == 0) && (b % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		int n1 = 20, n2 = 15;

		// Find the GCD of n1 and n2
		int gcd = findGcd2(n1, n2);

		System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}
}
