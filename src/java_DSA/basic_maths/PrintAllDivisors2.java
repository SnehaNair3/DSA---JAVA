package java_DSA.basic_maths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors2 {

	public static List<Integer> getAllDivisors2(int num) {
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				res.add(i);
			}

			if (i != num / i) {
				res.add(num / i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		List<Integer> res = getAllDivisors2(12);

		System.out.println(res);
	}
}
