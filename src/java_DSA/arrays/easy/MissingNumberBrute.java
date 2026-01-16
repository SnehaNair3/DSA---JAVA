package java_DSA.arrays.easy;

public class MissingNumberBrute {

	
	public static int findMissingBrute(int[] arr,int n) {
		
		for(int i=1;i<=n;i++) {
			int flag=0;
			for(int j=0;j<n-1;j++) {
				if(arr[j] == i) {
					flag=1;
					break;
				}
			}
			if(flag ==0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//int[] arr= {1,2,4,5};
		//int n=5;
		
		int[] arr= {1,2,3,5,6,7,8,9,10,11,12,13,14,15};
		
		int n=15;
		
		System.out.println(findMissingBrute(arr,n));
	}
}
