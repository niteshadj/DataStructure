/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         Given an array Arr of N integers arranged in a circular fashion. Your
 *         task is to find the minimum absolute difference between adjacent
 *         elements.
 *
 */
public class MinAdjacentDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 3, -10, 6, 4, -8, 1 };
		minAdjDiff(arr, arr.length);
	}

	public static int minAdjDiff(int arr[], int n) {
		int min = Math.abs(arr[n - 1] - arr[0]);
		for (int i = 0; i < n - 1; i++) {
			min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
		}
		return min;
	}

}
