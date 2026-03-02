package java_DSA.binary_search.answers;

import java.util.Scanner;

public class NthRootLinear {

	public static long find(int i, int n) {
		long ans = (long) Math.pow(i, n);
		return ans;
	}

	public static long findNthRoot1(int n, int m) {
		for (int i = 1; i <= m; i++) {
			if (find(i, n) == m) {
				return i;
			} else if (find(i, n) > m) {
				break;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = sc.nextInt();

		System.out.println("Enter m : ");
		int m = sc.nextInt();

		System.out.println(findNthRoot1(n, m));
	}
}
