public class Main {

	public static void main(String[] args) {
		int[] arr = {-3, 2, 3, -4, 3, 1};

		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		int pairSize = 1;
		int startIndex = 0;

		int currentIndex = 0;
		for (int i = startIndex; i < arr.length; i++) {
			while (currentIndex + pairSize <= arr.length) {
				for (int j = 0; j < pairSize; j++) {
					currentSum += arr[currentIndex++];
				}
				pairSize++;
			}
			sum = Math.max(sum, currentSum);
			currentSum = 0;
			pairSize = 1;
			currentIndex = startIndex;
			startIndex++;
		}
		System.out.println(sum);

	}
}
