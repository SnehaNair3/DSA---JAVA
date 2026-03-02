package java_DSA.binary_search.answers;

import java.util.Scanner;

public class SquareRootLinear {

	public static int findSqrt1(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			if (i * i <= n) {
				ans = i;
			} else {
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(findSqrt1(n));
	}
}
