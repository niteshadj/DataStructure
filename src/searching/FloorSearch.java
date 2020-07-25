/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given a sorted array arr[] of size N without duplicates, and given a
 *         value x. Find the floor of x in given array. Floor of x is defined as
 *         the largest element K in arr[] such that K is smaller than or equal
 *         to x.
 *
 */
public class FloorSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long arr[] = { 35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113 };
		System.out.println(findFloor(arr, 0, arr.length, 159));
	}

	static int findFloor(long arr[], int left, int right, long x) {
		if (left > right)
			return -1;
		if (arr.length == 1 && arr[0] <= x)
			return 0;
		int mid = (left + right) / 2;
		if (arr[mid] == x)
			return mid;
		else if (arr[mid] < x && mid == arr.length - 1)
			return mid;
		else if (arr[mid] < x && mid != arr.length - 1 && arr[mid + 1] > x)
			return mid;
		else if (arr[mid] > x && mid != 0 && x > arr[mid - 1])
			return mid - 1;
		else if (arr[mid] < x)
			return findFloor(arr, mid + 1, right, x);
		else if (arr[mid] > x)
			return findFloor(arr, left, mid - 1, x);
		return -1;
	}

}
