/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 */
public class MaximumDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };

		int maxDiff = findMaxDiff(arr, arr.length);
		System.out.println(maxDiff);
	}

	private static int findMaxDiff(int[] arr, int length) {
		int min = arr[0];
		int maxDiff = 0;
		for (int i = 1; i < length; i++) {
			maxDiff = Math.max(maxDiff, arr[i] - min);
			if (min > arr[i]) {
				min = arr[i];
			}

		}

		return maxDiff;
	}

}
