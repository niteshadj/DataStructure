/**
 * 
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nadjriya
 *
 */
public class MaxAndSecondMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 1, 2 };
		int arr1[] = { 1, 2, 3, 4, 5 };
		System.out.println(largestAndSecondLargest(3, arr));
		maximumAdjacent(5, arr1);

	}

	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
		int max = arr[1];
		int secondMax = -1;
		for (int i = 0; i < sizeOfArray; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = Math.max(max, arr[i]);
			} else if ((arr[i] > secondMax && arr[i] != max)) {
				secondMax = arr[i];
			}

		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(max);
		if (max == secondMax) {
			list.add(-1);
		} else {
			list.add(secondMax);
		}
		return list;

	}

	static void maximumAdjacent(int sizeOfArray, int arr[]) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < sizeOfArray - 1; i++) {
			stringBuffer.append(Math.max(arr[i], arr[i + 1]) + " ");

		}
		System.out.print(stringBuffer);

	}

}
