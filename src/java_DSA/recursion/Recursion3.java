package java_DSA.recursion;

import java.util.Scanner;

public class Recursion3 {

	public static void print3(int i, int n) {
		if (n < 1) {
			return;
		}

		System.out.print(n + " ");
		print3(1, n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();

		print3(1, n);
	}
}
