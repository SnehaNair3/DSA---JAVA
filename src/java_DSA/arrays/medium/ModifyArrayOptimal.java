package java_DSA.arrays.medium;

public class ModifyArrayOptimal {

	public static void modifyArray3(int[] arr) {

		int i = 0;

		while (i < arr.length) {
			if (arr[i] != -1 && arr[i] != arr[arr[i]]) {
				// swap
				int temp = arr[i];
				arr[i] = arr[arr[i]];
				arr[temp] = temp;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

		// Call the modifyArray method
		modifyArray3(arr);

		// Print the modified array
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
