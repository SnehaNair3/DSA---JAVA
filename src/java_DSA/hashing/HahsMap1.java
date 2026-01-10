package java_DSA.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HahsMap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// pre-compute
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

//		for (int i = 0; i < n; i++) {
//			int key = arr[i];
//			int freq = 0;
//			if (map.containsKey(key)) {
//				freq = map.get(key);
//			}
//			freq++;
//			map.put(key, freq);
//		}

		for (int i = 0; i < n; i++) {
			int key = arr[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			System.out.println(it.getKey() + " : " + it.getValue());
		}
	}
}
