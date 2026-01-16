package java_DSA.arrays.easy;

public class MissingNumberBetter2 {

	public static int findMissingHash2(int[] nums) {
		int[] hash=new int[nums.length+2];

        for(int i=0;i<nums.length;i++){
            hash[nums[i]]=1;
        }

        for(int i=1;i<=nums.length+1;i++){
            if(hash[i] ==0){
                return i;
            }
        }
        return -1;
	}
	
	public static void main(String[] args) {
		//int[] arr = { 1, 2, 4, 5 };
		int[] arr = { 1, 2,3, 4, 5 ,7,8,9,10,11,12};

		System.out.println(findMissingHash2(arr));
	}
}
