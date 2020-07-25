/**
 * 
 */
package array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author nadjriya
 * 
 *         Given N integer ranges, the task is to find the maximum occurring
 *         integer in these ranges. If more than one such integer exits, print
 *         the smallest one. The ranges are given as two arrays L[] and R[].
 *         L[i] consists of starting point of range and R[i] consists of
 *         corresponding end point of the range.
 *
 */
public class MaxOccuredIntInRanges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int L[] = { 2, 1, 3 };
		int R[] = { 5, 3, 9 };

		System.out.println(maxOccured(L, R, 3, 0));
	}

	public static int maxOccured(int L[], int R[], int n, int maxx) {
		int arr[] = null;
		int res = 0;
		for (int i = 0; i < n; i++) {
			int k = 0;
			arr = new int[R[i] - L[i] + 1];
			int j = L[i];
			while (j <= R[i]) {
				arr[k] = j;
				j++;
				k++;
			}
			Arrays.sort(arr);

			int maxOccured = arr[0];
			int maxCount = 1;
			int count = 1;
			for (int m = 0; i < arr.length - 1; m++) {
				if (arr[m] == arr[m + 1]) {
					count++;
					if (count > maxCount) {
						maxCount = count;
						maxOccured = arr[i];
					}
				} else {
					count = 1;
				}

			}

		}

		return res;
	}

}
