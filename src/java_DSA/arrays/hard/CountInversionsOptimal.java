package java_DSA.arrays.hard;

public class CountInversionsOptimal {

	// Function to merge two halves and count inversions
	public static int merge(int[] arr, int low, int mid, int high) {

		// Temporary array
		int[] temp = new int[high - low + 1];

		// Starting indices of left and right half
		int left = low;
		int right = mid + 1;
		int k = 0;

		// variable to count inversions
		int cnt = 0;

		// Merge elements in sorted order
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
				cnt += (mid - left + 1); // count inversions
			}
		}

		// copy remaining elements of left half
		while (left <= mid) {
			temp[k++] = arr[left++];
		}

		// copy remaining elements of right half
		while (right <= high) {
			temp[k++] = arr[right++];
		}

		// copy back to original array
		for (int i = low; i <= high; i++) {
			arr[i] = temp[i - low];
		}

		return cnt;
	}

	// Merge sort function
	public static int mergeSort(int[] arr, int low, int high) {
		int cnt = 0;

		if (low >= high) {
			return cnt;
		}

		int mid = (low + high) / 2;

		// Count inversions in left half
		cnt += mergeSort(arr, low, mid);
		// Count inversions in right half
		cnt += mergeSort(arr, mid + 1, high);
		// Count inversions during merge
		cnt += merge(arr, low, mid, high);

		return cnt;
	}

	// Function to get number of inversions
	public static int numberOfInversionsOptimal(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {

//		int[] arr = { 2, 3, 7, 1, 3, 5 };

		// int[] arr= {-10,-5,6,11,15,17};

		int[] arr = { 5, 3, 2, 4, 1 };

		System.out.println(numberOfInversionsOptimal(arr));
	}
}
