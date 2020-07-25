/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given a sorted array arr[] and a number x, write a function that
 *         counts the occurrences of x in arr[]. Expected time complexity is
 *         O(Logn)
 *
 */
public class FrequencyCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 3, 7, 8 };
		int l = findLeftMostIndex(arr, 0, arr.length - 1, 3);
		int r = findRightMostIndex(arr, 0, arr.length - 1, 3);
		if (l == -1 || r == -1)
			System.out.println(-1);
		else
			System.out.println(r - l + 1);

	}

	private static int findLeftMostIndex(int[] a, int low, int high, int x) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (a[mid] == x && (mid == 0 || a[mid - 1] != x))
			return mid;
		else if (a[mid] >= x)
			return findLeftMostIndex(a, low, mid - 1, x);
		else
			return findLeftMostIndex(a, mid + 1, high, x);

	}

	private static int findRightMostIndex(int[] a, int low, int high, int x) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (a[mid] == x && (mid == a.length - 1 || a[mid + 1] != x))
			return mid;
		else if (a[mid] <= x)
			return findRightMostIndex(a, mid + 1, high, x);
		else
			return findRightMostIndex(a, low, mid - 1, x);

	}
}
