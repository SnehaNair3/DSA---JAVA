package java_DSA.arrays;

import java.util.Stack;

public class MoveNegativesToEndExtraSpace {

	public static void segregateElements(int[] arr) {
		Stack<Integer> pos = new Stack<Integer>();
		Stack<Integer> neg = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				neg.push(arr[i]);
			} else {
				pos.push(arr[i]);
			}
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (!neg.isEmpty()) {
				arr[i] = neg.pop();
			} else {
				arr[i] = pos.pop();
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, -1, -3, -2, 7, 5, 11, 6 };
		segregateElements(arr);
		
		for(int ele : arr) {
			System.out.print(ele +" ");
		}

	}
}
