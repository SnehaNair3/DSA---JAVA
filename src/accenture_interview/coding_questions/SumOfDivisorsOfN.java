package accenture_interview.coding_questions;

public class SumOfDivisorsOfN {

	public static int findSumOfDivisors(int N) {
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		//int N = 6;
		int N = 10;

		System.out.println(findSumOfDivisors(N));
	}
}
