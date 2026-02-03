package java_DSA.arrays.hard;

public class RepeatingMissingBetter {

	public static int[] findMissingRepeatingNumbers(int[] nums) {

		int n = nums.length;
		int repeating = -1;
		int missing = -1;

		int[] hash = new int[n + 1];

		for (int i = 0; i < n; i++) {
			hash[nums[i]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (hash[i] == 2) {
				repeating = i;
			}

			if (hash[i] == 0) {
				missing = i;
			}
			
			if(repeating !=-1 && missing!=-1) {
				break;
			}
		}

		return new int[] { repeating, missing };

	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };

		int[] res = findMissingRepeatingNumbers(arr);
		for (int num : res) {
			System.out.print(num + " ");
		}

	}
}
