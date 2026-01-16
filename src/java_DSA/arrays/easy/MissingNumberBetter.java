package java_DSA.arrays.easy;

public class MissingNumberBetter {

	public static int findMissingHash(int[] arr, int n) {
		int[] hash = new int[n + 1];

		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]] = 1;
		}

		for (int i = 1; i <= n; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int n = 5;

		System.out.println(findMissingHash(arr, n));
	}
}
