package java_DSA.arrays.medium;

public class ModifyArrayNaive {

	public static void modifyArray1(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// check is any arr[j] exists such that arr[j]=i;
				if (arr[j] == i) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break;
				}
			}
		}

		// Iterate over the array
		for (int i = 0; i < n; i++) {

			// If not present
			if (arr[i] != i) {
				arr[i] = -1;
			}
		}

		// print the output
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

		int n = arr.length;

		modifyArray1(arr, n);
	}
}
