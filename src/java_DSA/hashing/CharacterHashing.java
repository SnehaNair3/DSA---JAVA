package java_DSA.hashing;

import java.util.Scanner;

public class CharacterHashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		s = sc.next();

		// pre-compute
		int[] hash = new int[26];
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i) - 'a']++;
		}

		int q;
		q = sc.nextInt();
		while (q-- > 0) {
			char c;
			c = sc.next().charAt(0);
			// fetch
			System.out.println(hash[c - 'a']);
		}
	}
}
