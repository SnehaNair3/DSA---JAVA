package ibm_practise;

public class PangramCheck {

	public static int isPangram(String[] A) {
		boolean[] seen = new boolean[26];

		for (String word : A) {
			for (char ch : word.toCharArray()) {
				seen[ch - 'a'] = true;
			}
		}

		for (boolean b : seen) {
			if (!b) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

	//	String[] A = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };

		String[] A = {"bit", "scale"};
		
		System.out.println(isPangram(A));
	}
}
