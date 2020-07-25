/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 *         Given a sorted array arr[] of distinct integers. Sort the array into
 *         a wave-like array and return it. In other words, arrange the elements
 *         into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 *         (considering the increasing lexicographical order).
 */
public class WaveArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 8, 9, 10 };
		convertToWave(arr, arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

	}

	public static void convertToWave(int a[], int n) {

		if (a[0] < a[1]) {
			swapElements(a, 0, 1);
		}

		for (int i = 1; i < n - 1;) {

			if ((i % 2) == 0) {

				if (a[i] < a[i - 1]) {
					swapElements(a, i - 1, i);
				} else if (a[i] < a[i + 1]) {
					swapElements(a, i, i + 1);
				}

			} else {

				if (a[i] > a[i - 1]) {
					swapElements(a, i - 1, i);
				} else if (a[i] > a[i + 1]) {
					swapElements(a, i, i + 1);
				}

			}
			i++;
		}

	}

	private static void swapElements(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
