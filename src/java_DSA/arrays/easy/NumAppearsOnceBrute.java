package java_DSA.arrays.easy;

public class NumAppearsOnceBrute {

	public static int findNumOnce(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int cnt = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == num) {
					cnt++;
				}
			}

			if (cnt == 1) {
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
		
		int[] arr = { 1, 1, 2,2, 3, 3, 4, 4 ,5,6,6,7,7,8,8};

		System.out.println(findNumOnce(arr));
	}
}
