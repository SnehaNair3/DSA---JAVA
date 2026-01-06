package java_DSA.recursion;

import java.util.Scanner;

public class Backtrack1toN {

	public static void print1ton(int i, int n) {
		if (i < 1) {
			return;
		}

		print1ton(i - 1, n);
		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n : ");
		int n = sc.nextInt();

		print1ton(n, n);
	}
}
