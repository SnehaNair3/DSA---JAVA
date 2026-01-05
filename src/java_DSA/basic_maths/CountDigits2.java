package java_DSA.basic_maths;

public class CountDigits2 {

	public static int countDigit(int n) {
		int count = (int) Math.log10(n) + 1;

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigit(100));
		System.out.println(countDigit(3));
		System.out.println(countDigit(67543));
	}
}
