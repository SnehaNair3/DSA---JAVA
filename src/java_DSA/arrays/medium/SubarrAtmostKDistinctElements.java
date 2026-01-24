package java_DSA.arrays.medium;

import java.util.HashMap;

public class SubarrAtmostKDistinctElements {

	
	public static int longestSubarrayAtMostK(int[] arr,int k) {
		
		HashMap<Integer,Integer> freq=new HashMap<Integer, Integer>();
		int left=0;
		int maxLen=0;
		
		for(int right=0;right < arr.length;right++) {
			freq.put(arr[right], freq.getOrDefault(arr[right], 0)+1);
			
			while(freq.size() <k) {
				freq.put(arr[left], freq.get(arr[left]-1));
				
				if(freq.get(arr[left]) ==0) {
					freq.remove(arr[left]);
				}
				left++;
			}
			
			maxLen=Math.max(maxLen, right-left+1);
			
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3};
		int k=2;
		
		System.out.println(longestSubarrayAtMostK(arr,k));
	}
}
