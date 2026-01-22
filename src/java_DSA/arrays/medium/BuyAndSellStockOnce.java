package java_DSA.arrays.medium;

public class BuyAndSellStockOnce {

	public static int buyAndSellOnce(int[] nums) {
		int min=nums[0];
		int profit=0;
		
		for(int i=1;i<nums.length;i++) {
			int cost=nums[i]-min;
			profit=Math.max(profit, cost);
			min=Math.min(min, nums[i]);
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		
		System.out.println(buyAndSellOnce(arr));
	}
}
