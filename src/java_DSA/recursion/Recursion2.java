package java_DSA.recursion;

import java.util.Scanner;

//print linearly from  to n
public class Recursion2 {

	public static void print2(int i, int n) {
		if (i > n) {
			return;
		}

		System.out.print(i + " ");
		print2(i + 1, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = sc.nextInt();

		print2(1, n);
	}
}
