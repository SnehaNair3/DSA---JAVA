package java_DSA.arrays;

public class CountPairsWithGivenSumSortedDuplicatesHandled {

	public static int countPairsSortedHandleDuplicates(int[] arr, int target) {
		int count = 0;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int currSum = arr[start] + arr[end];

			if (currSum > target) {
				end--;
			} else if (currSum < target) {
				start++;
			} else {
				int e1 = arr[start], e2 = arr[end], c1 = 0, c2 = 0;

				while (start <= end && arr[start] == e1) {
					start++;
					c1++;
				}

				while (start <= end && arr[end] == e2) {
					end--;
					c2++;
				}

				if (e1 == e2) {
					count += (c1 * (c1 - 1)) / 2;
				} else {
					count += (c1 * c2);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 1, 5, 5, 7 };

		int target = 6;

		int res = countPairsSortedHandleDuplicates(nums, target);

		System.out.println("Count is : ");
		System.out.println(res);
	}
}
