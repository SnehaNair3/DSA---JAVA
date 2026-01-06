package java_DSA.recursion;

public class Parameterised1 {

	public static void para1(int i, int sum) {
		if (i < 1) {
			System.out.println(sum);
			return;
		}

		para1(i - 1, sum + i);

	}

	public static void main(String[] args) {
		int n = 5;

		para1(n, 0);
	}
}
