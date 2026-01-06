package java_DSA.recursion;

public class Factorial1 {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int num = 7;

		System.out.println("Factorial of " + num + " is : " + fact(num));
	}
}
