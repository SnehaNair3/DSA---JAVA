package java_DSA.binary_search.one_dimensional_arrays;

public class SingleElementInSortedArray {

	public static int findSingle(int[] nums) {
		int n=nums.length;
		
		if(n==1) {
			return nums[0];
		}
		
		//first element
		if(nums[0]!=nums[1]) {
			return nums[0];
		}
		//last element
		if(nums[n-1]!=nums[n-2]) {
			return nums[n-1];
		}
		
		int low=1;
		int high=n-2;
		
		while(low <=high) {
			int mid=(low+high)/2;
			
			if((nums[mid] != nums[mid-1]) && (nums[mid]!= nums[mid+1])) {
				return nums[mid];
			}
			
			//standing on left half
			if((mid%2 ==1) && (nums[mid-1]==nums[mid]) || ((mid%2==0) && nums[mid+1]==nums[mid])){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

		System.out.println(findSingle(arr));
	}
}
