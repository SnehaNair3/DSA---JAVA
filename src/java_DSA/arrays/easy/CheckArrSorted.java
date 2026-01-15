package java_DSA.arrays.easy;

public class CheckArrSorted {

	
	public static boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//int[] arr = { 15, 101, 38, 129, 7, 1 };
		
		//int[] arr= {1,2,3,6,8,9};
		
		//int[] arr= {-1,4,6,10,34,64,80,100};
		
		int[] arr= {9,-2,89,56,3,2};

		System.out.println(isSorted(arr));
	}
}
