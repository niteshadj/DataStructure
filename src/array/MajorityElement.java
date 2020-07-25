/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         A majority element in an array A[] of size n is an element that
 *         appears more than n/2 times (and hence there is at most one such
 *         element).
 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 6, 3, -10, 6, 4, 6, 6 };
		int res = findMajorityElement(arr);
		if (res != -1)
			System.out.println(arr[res]);
	}

	private static int findMajorityElement(int[] a) {
		int res = 0;
		int count = 1;

		// Moore voting algo
		for (int i = 1; i < a.length; i++) {
			if (a[res] == a[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				count = 1;
				res = i;
			}
		}

		// only reqd when there no majority is a valid use case
		count = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == a[res]) {
				count++;
			}
		}

		if (count < (a.length / 2 + 1))
			return -1;

		return res;
	}

}
