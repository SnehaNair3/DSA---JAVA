package java_DSA.basic_maths;

public class CheckArmstrong {

	public static boolean ifArmstrong(int num) {
		int originalNum = num;

		int result = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			result = (int) (result + Math.pow(lastDigit, 3));
			num = num / 10;
		}

		if (result == originalNum) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(ifArmstrong(100));
		System.out.println(ifArmstrong(153));
		System.out.println(ifArmstrong(371));
	}
}
