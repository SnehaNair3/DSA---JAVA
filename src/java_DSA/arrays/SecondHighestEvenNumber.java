package java_DSA.arrays;

public class SecondHighestEvenNumber {

	public static int secondHighestEven(int[] nums) {
		int largest=nums[0];
		int secondLargest=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			if(i % 2 ==0) {
				if(nums[i] > largest) {
					secondLargest=largest;
					largest=nums[i];
					
				}else if(nums[i] > secondLargest) {
					secondLargest=nums[i];
				}
			}
		}
		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {20,35,50,65,80,95,100};
		
		int result=secondHighestEven(arr);
		System.out.println("Second highest even no is : ");
		System.out.println(result);
	}
	
}
