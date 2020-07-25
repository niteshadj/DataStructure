/**
 * 
 */
package searching;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 *         Given an array of positive integers, where elements are consecutive
 *         (sorted). Also, there is a single element which is repeating X (any
 *         variable) number of times. Now, the task is to find the element which
 *         is repeated and number of times it is repeated.
 */
public class CountRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		while (noOfTestcases > 0) {
			noOfTestcases--;
			int sizeOfArray = sc.nextInt();
			int[] arr = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arr[i] = sc.nextInt();

			}

			int repeatingElem = findRepeatingElement(arr, 0, arr.length - 1);
			if (repeatingElem == -1) {
				System.out.println(-1);
			} else {
				repeatingElem = arr[repeatingElem];

				int l = findLeftMostIndex(arr, 0, arr.length - 1, repeatingElem);
				int r = findRightMostIndex(arr, 0, arr.length - 1, repeatingElem);
				if (l == -1 || r == -1)
					System.out.println(-1);
				else
					System.out.println(repeatingElem + " " + (r - l + 1));
			}

		}

	}

	static int findRepeatingElement(int a[], int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (mid != 0 && a[mid] == a[mid - 1])
			return mid;
		else if (mid != a.length - 1 && a[mid] == a[mid + 1])
			return mid;
		else
		{
			if(a[mid]-a[0]==mid)
				return findRepeatingElement(a, mid+1, high);
			else
				return findRepeatingElement(a, low, mid-1);
		}
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
