package java_DSA.arrays.hard;

public class CountInversionsBrute {

	public static long numberOfInversions(int[] nums) {

		long count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
	//	int[] arr = { 2, 3, 7, 1, 3, 5 };
		
	//	int[] arr= {-10,-5,6,11,15,17};
		
		int[] arr= {5,3,2,4,1};

		System.out.println(numberOfInversions(arr));
	}
}
