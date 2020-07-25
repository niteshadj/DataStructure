/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         You are given an array arr[] of N integers including 0. The task is
 *         to find the smallest positive number missing from the array.
 *
 */

// Pending
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 0, 1 };
		System.out.println(missingNumber(arr, arr.length));
	}

	static int missingNumber(int a[], int n) {
		int size = getPositiveArray(a, n);
		for (int i = 0; i < size; i++) {
			if ((Math.abs(a[i])) <= size) {
				if (a[Math.abs(a[i]) - 1] > 0) {

					a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
				}
			}
		}

		for (int i = 0; i < size; i++) {
			if (a[i] > 0) {
				return (i + 1);
			}
		}

		if (size == 1 && a[size - 1] == 0) {
			return 1;
		}

		return (size + 1);

	}

	private static int getPositiveArray(int[] a, int n) {
		int j = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] <= 0) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j--;
			}
		}

		return j + 1;

	}
}
