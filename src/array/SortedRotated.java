/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 */
public class SortedRotated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 80,36,45 };
		System.out.println(checkRotatedAndSorted(arr, arr.length));
	}

	public static boolean checkRotatedAndSorted(int arr[], int num) {
		int i = 0;
		boolean isRotated = false;
		boolean isDecreasing = true;
		int countDecreasing = 0;
		if (num == 1) {
			return true;
		}
		for (i = 0; i < num - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				countDecreasing--;
			} else {
				countDecreasing++;
			}
		}
		if (countDecreasing <= 0)
			isDecreasing = false;
		if (isDecreasing) {
			for (i = 0; i < num - 1; i++) {
				if (arr[i + 1] > arr[i]) {
					isRotated = true;
					break;
				}

			}

			if (!isRotated && num!=2)
				return false;

			LeftRotate.leftRotateByDplace(arr, num, i + 1);

			for (i = 0; i < num - 1; i++) {
				if (arr[i + 1] > arr[i]) {
					return false;
				}
			}

		}

		else {
			for (i = 0; i < num - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					isRotated = true;
					break;
				}

			}

			if (!isRotated && num!=2)
				return false;

			LeftRotate.leftRotateByDplace(arr, num, i + 1);

			for (i = 0; i < num - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					return false;
				}
			}
		}

		return true;
	}

}
