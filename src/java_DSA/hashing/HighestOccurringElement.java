package java_DSA.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement {

	public static int mostFrequentElement(int[] nums) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int maxFreq=0;
		int maxEle=0;
		
		for(Map.Entry<Integer, Integer> it : map.entrySet()) {
			int element=it.getKey();
			int count=it.getValue();
			
			if(count > maxFreq) {
				maxEle=element;
				maxFreq=count;
			}else if(count == maxFreq) {
				maxEle=Math.min(maxEle, element);
			}
		}
		return maxEle;
	}
	
	public static void main(String[] args) {
		HighestOccurringElement high=new HighestOccurringElement();
		int[] arr= {4, 4, 5, 5, 6};
		System.out.println(high.mostFrequentElement(arr));
	}
}
