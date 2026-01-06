package java_DSA.recursion;

import java.util.Scanner;

//print name n times.
public class Recursion1 {
	public static void printName(int i, int n) {
		if (i > n) {
			return;
		}

		System.out.println("Hello");

		printName(i + 1, n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = sc.nextInt();

		printName(1, n);
	}
}
