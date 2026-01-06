package java_DSA.recursion;

public class Functional1 {

	public static int sum1(int n) {
		if (n == 0) {
			return 0;
		}

		return n + sum1(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;

		System.out.println(sum1(n));
	}
}
