package java_DSA.binary_search.answers;

import java.util.Scanner;

public class NthRootBinary {

	public static int findNthRoot2(int n, int m) {
		int low = 1;
		int high = m;

		while (low <= high) {
			int mid = (low + high) / 2;

			int midN = findN(mid, n, m);

			if (midN == 1) {
				return mid;
			} else if (midN == 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int findN(int mid, int n, int m) {
		long ans = 1;

		for (int i = 1; i <= n; i++) {
			ans = ans * mid;

			if (ans > m) {
				return 2;
			} else if (ans == m) {
				return 1;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = sc.nextInt();

		System.out.println("Enter m : ");
		int m = sc.nextInt();

		System.out.println(findNthRoot2(n, m));
	}
}
