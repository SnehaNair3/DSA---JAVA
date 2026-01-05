package java_DSA.basic_maths;

public class CheckPrime2 {

	public static boolean isPrime2(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

//		for (int i = 2; i <= num / 2; i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime2(67));
		System.out.println(isPrime2(3));
		System.out.println(isPrime2(31));
		System.out.println(isPrime2(18));
		System.out.println(isPrime2(42));
		System.out.println(isPrime2(120));
	}
}
