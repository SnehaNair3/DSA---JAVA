package java_DSA.basic_maths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors1 {

	public static List<Integer> getAllDivisors(int num) {
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		//List<Integer> res = getAllDivisors(36);
		List<Integer> res = getAllDivisors(12);
		
		System.out.println(res);

//		for (int val : res) {
//			System.out.print(val + " ");
//		}
		System.out.println();
	}
}
