package accenture_interview.coding_questions;

import java.util.Arrays;

public class LargestNumUsingArrElements {

	
	public static int findLargestNum(int[] arr) {
		String num=arr.toString();
		
		String newStr="";
		
		for(char ch : num.toCharArray()) {
			if(ch != ' ') {
				newStr+=ch;
			}
		}
		
		char[] ch=newStr.toCharArray();
		
		Arrays.sort(ch);
		
		
		
		for(int i=arr.length-1;i>=0;i--) {
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,30,34,5,9};
		
		findLargestNum(arr);
	}
}
