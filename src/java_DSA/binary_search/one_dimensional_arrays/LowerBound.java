package java_DSA.binary_search.one_dimensional_arrays;

public class LowerBound {

	public static int findlb(int[] nums,int target) {
		int n=nums.length;
		
		int low=0, high=n-1;
		
		int ans=n;
		
		while(low <=high) {
			int mid=(low +high)/2;
			
			if(nums[mid] >= target) {
				high=mid-1;
				ans=mid;
			}else {
				low=mid+1;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {3,5,8,15,19};
		int target=9;
		
		System.out.println(findlb(arr,target));
	}
}
