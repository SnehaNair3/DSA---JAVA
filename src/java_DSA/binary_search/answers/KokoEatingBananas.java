package java_DSA.binary_search.answers;

import java.util.Arrays;

public class KokoEatingBananas {
	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;

		System.out.println(findMinSpeed(piles, h));
	}

	public static int findMinSpeed(int[] piles, int h) {
		// find maximum element in the array
		int maxPile = Arrays.stream(piles).max().getAsInt();

		int low = 1;
		int high = maxPile;
		int ans = maxPile;

		while (low <= high) {
			int mid = (low + high) / 2;

			long totalH = calculateTotalH(piles, mid);

			if (totalH <= h) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static long calculateTotalH(int[] piles, int speed) {
		long totalH = 0;

		for (int bananas : piles) {
			totalH += (long) Math.ceil((double) bananas / speed);
		}
		return totalH;
	}
}
