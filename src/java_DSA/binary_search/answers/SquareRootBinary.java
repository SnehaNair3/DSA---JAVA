package java_DSA.binary_search.answers;

import java.util.Scanner;

public class SquareRootBinary {
	public static int findSqrt2(int n) {
		int low=1;
		int high=n;
		int ans=1;
		
		while(low <=high) {
			int mid=(low+high)/2;
			if(mid*mid <= n) {
				ans= mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(findSqrt2(n));
	}
}
