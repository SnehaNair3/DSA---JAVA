package java_DSA.recursion;

public class CheckPalindrome1 {

	public static boolean isPalindome(String str, int i, int n) {

		if (i >= n / 2) {
			return true;
		}

		if (str.charAt(i) != str.charAt(n - i - 1)) {
			return false;
		}

		return isPalindome(str, i + 1, n);
	}

	public static void main(String[] args) {
		//String str = "madam";
		//String str = "11211";
		String str = "helloolle";

		System.out.println(isPalindome(str, 0, str.length()));
	}

}
