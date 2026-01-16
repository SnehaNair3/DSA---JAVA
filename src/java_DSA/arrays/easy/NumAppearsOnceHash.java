package java_DSA.arrays.easy;

public class NumAppearsOnceHash {

	public static int findNumOnceHash(int[] arr) {

		int n = arr.length;
		int maxEle = arr[0];

		// finding max element
		for (int i = 0; i < n; i++) {
			maxEle = Math.max(maxEle, arr[i]);
		}

		// declare an hash array of size maxEle+1.
		int[] hash = new int[maxEle + 1];

		// putting array elements into hash array at its index
		for (int i = 0; i < n; i++) {
			hash[arr[i]]++;
		}

		// finding index with value 1
		for (int i = 0; i < n; i++) {
			if (hash[arr[i]] == 1) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };

		System.out.println(findNumOnceHash(arr));
	}
}
