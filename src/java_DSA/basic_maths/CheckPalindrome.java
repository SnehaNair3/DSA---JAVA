package java_DSA.basic_maths;

public class CheckPalindrome {

	public static boolean isPalindome(int num) {
		int originalNum = num;

		int reversedNum = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			reversedNum = reversedNum * 10 + lastDigit;
			num = num / 10;
		}

		if (reversedNum == originalNum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindome(1221));
		System.out.println(isPalindome(7789));
	}
}
