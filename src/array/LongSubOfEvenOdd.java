/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         You are given an array of size n. Find the maximum possible length of
 *         a subarray such that its elements are arranged alternately either as
 *         even and odd or odd and even .
 *
 */
public class LongSubOfEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 3};
		System.out.println(maxEvenOdd(arr, arr.length));
	}

	public static int maxEvenOdd(int arr[], int n) {
		int res = 1;
		int j = 1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] % 2 != arr[i + 1] % 2) {
				j++;
			} else {
				res = Math.max(res, j);
				j = 1;
			}
		}
		return Math.max(res, j);
	}

}
