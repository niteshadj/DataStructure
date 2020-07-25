/**
 * 
 */
package searching;

/**
 * @author nadjriya
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 6));

		System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 6));
	}

	private static int binarySearchRecursive(int[] a, int low, int high, int x) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (a[mid] == x)
			return mid;
		else if (a[mid] > x)
			return binarySearchRecursive(a, low, mid - 1, x);
		else
			return binarySearchRecursive(a, mid + 1, high, x);

	}

	public static int binarySearch(int[] a, int low, int high, int x) {
		int mid = -1;
		do {
			mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (mid < x) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		} while (low <= high);

		return -1;
	}

}
