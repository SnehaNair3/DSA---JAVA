package java_DSA.hashing;

public class FrequencyCounterBruteForce {

	public static void countFrequency(int[] arr, int n) {

		boolean[] visited = new boolean[n];

		int maxFreq = 0, minFreq = n;
		int maxEle = 0, minEle = 0;

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}

			if (count > maxFreq) {
				maxEle = arr[i];
				maxFreq = count;
			}

			if (count < minFreq) {
				minEle = arr[i];
				minFreq = count;
			}
		}

		System.out.println("The highest freq element is : " + maxEle);
		System.out.println("The lowest freq element is : " + minEle);
	}

	public static void main(String[] args) {
		FrequencyCounterBruteForce fc = new FrequencyCounterBruteForce();
		int[] arr = { 10, 5, 10, 15, 10, 5 };
		fc.countFrequency(arr, arr.length);
	}
}
