/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given a binary sorted non-increasing array of 1s and 0s. You need to
 *         print the count of 1s in the binary array.
 *
 */
public class Count1InBinaryArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 1, 1, 0, 0, 0 };
		System.out.println(countOnes(arr, arr.length));
	}

	public static int countOnes(int arr[], int N) {

		int firstIndexOf1 = findRightMostIndex(arr, 0, N - 1, 1);
		if (firstIndexOf1 != -1)
			return firstIndexOf1+1;

		return 0;

	}

	private static int findRightMostIndex(int[] a, int low, int high, int x) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (a[mid] == x && (mid == a.length - 1 || a[mid + 1] != x))
			return mid;
		else if (a[mid] >= x)
			return findRightMostIndex(a, mid + 1, high, x);

		else
			return findRightMostIndex(a, low, mid - 1, x);

	}

}
