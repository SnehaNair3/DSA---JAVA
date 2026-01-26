package java_DSA.arrays.hard;

public class PascalTriangle2 {

	public static void printARow(int n) {
		long ans = 1;
		System.out.print(ans+" ");

		for (int i = 1; i < n; i++) {
			ans = ans * (n - i);
			ans = ans / (i);
			System.out.print(ans+" ");
		}
	}

	public static void main(String[] args) {

		printARow(6);
	}
}
