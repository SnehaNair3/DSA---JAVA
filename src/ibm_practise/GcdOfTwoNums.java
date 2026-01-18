package ibm_practise;

import java.util.Scanner;

public class GcdOfTwoNums {

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		scanner.close();

		int gcd = findGCD(num1, num2);
		System.out.println("GCD: " + gcd);
	}
}
