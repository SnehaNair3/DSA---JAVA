package java_DSA.arrays.easy;

public class MaxConsecutiveOnes {

	public static int findMaxOnes(int[] arr) {
		int max = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

		int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1,1, 0, 1 };

		System.out.println(findMaxOnes(arr));
	}
}
