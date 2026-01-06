package java_DSA.recursion;

import java.util.Scanner;

public class Recursion4 {

	public static void print4(int i, int n) {
		if (i < 1) {
			return;
		}

		System.out.print(i + " ");
		print4(i - 1, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();

		print4(n, n);
	}
}
