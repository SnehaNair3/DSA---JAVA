package java_DSA.sorting;

import java.util.ArrayList;
import java.util.List;

import java_DSA.arrays.ArrayLeaders;

public class MergeSort {

	public static void mergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;

		mergeSort(arr, low, mid);

		mergeSort(arr, mid + 1, high);

		// merge
		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<Integer>();
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };

		System.out.println("Before sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		int n = arr.length;
		mergeSort(arr, 0, n - 1);

		System.out.println("After sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}
}
