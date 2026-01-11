package java_DSA.hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqCounterOptimal {

	public static void freqCounter(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int maxFreq = 0, minFfreq = n;
		int maxEle = 0, minEle = 0;

		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			int element = it.getKey();
			int count = it.getValue();

			if (count > maxFreq) {
				maxEle = element;
				maxFreq = count;
			}

			if (count < minFfreq) {
				minEle = element;
				minFfreq = count;
			}

		}
		// Print results
		System.out.println("The highest frequency element is: " + maxEle);
		System.out.println("The lowest frequency element is: " + minEle);
	}

	public static void main(String[] args) {
		FreqCounterOptimal fc2 = new FreqCounterOptimal();
		int[] arr = { 10, 5, 10, 15, 10, 5 };
		fc2.freqCounter(arr, arr.length);
	}
}
