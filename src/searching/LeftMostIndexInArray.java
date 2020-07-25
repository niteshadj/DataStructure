package searching;

/**
 * @author nadjriya
 * 
 *         Given a sorted array of positive integers (elements may be repeated)
 *         and a number x. The task is to find the leftmost index of x in the
 *         given array. Logn time
 *
 */
public class LeftMostIndexInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 3, 7, 8 };
		System.out.println(findLeftMostIndex(arr, 0, arr.length - 1, 3));

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
}
