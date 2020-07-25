/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         Given an unsorted array arr[] of size N, rotate it by D elements in
 *         the counter-clockwise direction. Expected Time Complexity: O(N).
 *         Expected Auxiliary Space: O(1).
 *
 */
public class LeftRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		leftRotateByDplace(arr, 10, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// (ArBr)r
	// O(n) time O(1) aux space
	public static void leftRotateByDplace(int[] arr, int n, int d) {
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);

	}

	// swap ith and n-i element
	private static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
