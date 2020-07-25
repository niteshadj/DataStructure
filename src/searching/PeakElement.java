/**
 * 
 */
package searching;

/**
 * @author nadjriya
 *
 *         Given an array of integers. Find a peak element in it. An array
 *         element is a peak if it is NOT smaller than its neighbours. For
 *         corner elements, we need to consider only one neighbour.
 */
public class PeakElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 3, 4 };
		int peak = findPeak(arr, 0, arr.length - 1);
		System.out.println(peak);
	}

	private static int findPeak(int[] a, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;

		if (mid == 0 && a[mid] >= a[mid + 1])
			return mid;

		else if (mid == a.length - 1 && a[mid] >= a[mid - 1])
			return mid;

		else if (mid != 0 && mid != a.length - 1 && a[mid - 1] <= a[mid] && a[mid] >= a[mid + 1])
			return mid;

		else if (mid != 0&& a[mid - 1] >= a[mid])
			return findPeak(a, low, mid - 1);
		else
			return findPeak(a, mid + 1, high);

	}

}
