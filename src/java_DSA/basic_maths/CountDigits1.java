package java_DSA.basic_maths;

public class CountDigits1 {

	public static int countDigits(int n) {
		int count = 0;

		while (n > 0) {
			count=count+1;
			n = n / 10;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigits(100));
		System.out.println(countDigits(145678));
		System.out.println(countDigits(98078656));
	}
}
