/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         An element in a sorted array can be found in O(log n) time via binary
 *         search. But suppose we rotate an ascending order sorted array at some
 *         pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might
 *         become 3 4 5 1 2. Devise a way to find an element in the rotated
 *         array in O(log n) time.
 *
 */
public class SearchInSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 3, 4 };
		int pivot = findPivot(arr, 0, arr.length - 1);
		int index = BinarySearch.binarySearch(arr, 0, pivot, 5);
		if (index != -1) {
			System.out.println(index);
		} else {
			System.out.println(BinarySearch.binarySearch(arr, pivot + 1, arr.length - 1, 5));
		}
	}

	private static int findPivot(int[] a, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (mid != a.length - 1 && a[mid] > a[mid + 1])
			return mid;
		else if(a[mid]<a[low])
			return findPivot(a, low, mid-1);
		else
			return findPivot(a, mid+1, high);

	}

}
