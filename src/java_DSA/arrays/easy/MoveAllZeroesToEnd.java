package java_DSA.arrays.easy;

public class MoveAllZeroesToEnd {

	public static void moveZerosEnd(int[] arr) {
		int i = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		//int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
		//int[] arr = { 0,0,9,4,0,3,0,3,2,1};
		
		//int[] arr= {0,0,0};
		
		int[] arr= {0,-1,2,0,-2,0,0,0,4};

		moveZerosEnd(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
