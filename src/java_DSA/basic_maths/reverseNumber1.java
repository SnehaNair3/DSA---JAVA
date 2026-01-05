package java_DSA.basic_maths;

public class reverseNumber1 {

	public static int reverse(int num) {

		int reversedNum = 0;

		while (num > 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}

		return reversedNum;
	}

	public static void main(String[] args) {
		System.out.println(reverse(567435));
		System.out.println(reverse(45));
		System.out.println(reverse(12345));
	}
}
