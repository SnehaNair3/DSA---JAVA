package java_DSA.recursion;

import java.util.Scanner;

public class BacktrackNto1 {

	public static void printnto1(int i, int n) {
		if (i > n) {
			return;
		}

		printnto1(i + 1, n);
		System.out.print(i + " ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n : ");
		int n = sc.nextInt();

		printnto1(1, n);
	}
}
