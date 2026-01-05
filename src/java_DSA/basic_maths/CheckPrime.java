package java_DSA.basic_maths;

public class CheckPrime {

	public static boolean isPrime(int num) {
		

		if (num == 0 || num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(isPrime(67));
		System.out.println(isPrime(3));
		System.out.println(isPrime(31));
		System.out.println(isPrime(18));
		System.out.println(isPrime(42));
		System.out.println(isPrime(120));
	}
}
