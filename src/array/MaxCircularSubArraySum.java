/**
 * 
 */
package array;

import java.awt.Point;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class MaxCircularSubArraySum {

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
			int count=sizeOfArray-(arr[sizeOfArray-1]-arr[0]);
			int repeatingElem = findRepeatingElement(arr, 0, arr.length-1);
			if (repeatingElem == -1) {
				System.out.println(-1);
			} else {
				repeatingElem = arr[repeatingElem];

				
					System.out.println(repeatingElem + " " + count);
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
				return findRepeatingElement(a, low, mid);
		}
	}

	

}
