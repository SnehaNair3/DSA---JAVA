package java_DSA.arrays.hard;

import java.util.ArrayList;

public class ReversePairsOptimal {

	// merge
	public static void merge(int[] nums, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (nums[left] <= nums[right]) {
				temp.add(nums[left]);
				left++;
			} else {
				temp.add(nums[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(nums[left]);
			left++;
		}

		while (right <= high) {
			temp.add(nums[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			nums[i] = temp.get(i - low);
		}
	}

	public static int countPairs(int[] nums, int low, int mid, int high) {
		int right = mid + 1;
		int cnt = 0;
		for (int i = low; i <= mid; i++) {
			while (right <= high && nums[i] > 2 * nums[right]) {
				right++;
			}
			cnt += (right - (mid + 1));
		}
		return cnt;
	}

	// merge sort
	public static int mergeSort(int[] nums, int low, int high) {
		int cnt = 0;

		if (low >= high) {
			return cnt;
		}

		int mid = (low + high) / 2;

		cnt += mergeSort(nums, low, mid); // left half
		cnt += mergeSort(nums, mid + 1, high); // right half
		cnt += countPairs(nums, low, mid, high); // Modification
		merge(nums, low, mid, high); // merging sorted halves
		return cnt;
	}

	public static int findReversePairsOptimal(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 40, 25, 19, 12, 9, 6, 2 };

		System.out.println(findReversePairsOptimal(arr));
	}
}
