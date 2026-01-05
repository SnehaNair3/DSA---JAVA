package accenture_interview.coding_questions;

public class ReverseStringOrder {

	public static String reverseWordOrder(String str) {
		String[] words = str.split("\\s+");

		String reversed = "";

		for (String word : words) {
			reversed = word + " " + reversed;
		}

		return reversed;
	}

	public static void main(String[] args) {
		//String str = "learn java programming";
//		String str = "Code to crack puzzle";
		String str = "Welcome to code";

		System.out.println(reverseWordOrder(str));
	}
}
