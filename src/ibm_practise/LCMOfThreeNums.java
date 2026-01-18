package ibm_practise;

import java.util.Scanner;

public class LCMOfThreeNums {

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}

		return findGCD(b, a % b);
	}

	public static int findLCM(int a, int b, int c) {
		int gcd = findGCD(a, b);
		int lcm = (a * b) / gcd;

		gcd = findGCD(lcm, c);
		lcm = (lcm * c) / gcd;

		return lcm;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter third number : ");
		int num3 = scanner.nextInt();

		scanner.close();

		int lcm = findLCM(num1, num2, num3);

		System.out.println("LCM : " + lcm);
	}
}
