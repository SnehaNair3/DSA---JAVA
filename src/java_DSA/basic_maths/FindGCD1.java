package java_DSA.basic_maths;

public class FindGCD1 {

	public static int findGcd1(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		if (a == 0) {
			return b;
		}
		return a;
	}

	public static void main(String[] args) {
		int n1 = 20, n2 = 15;

		// Find the GCD of n1 and n2
		int gcd = findGcd1(n1, n2);

		System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}
}
