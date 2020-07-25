/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 */
public class RemoveDuplicatesSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 3, 3, 3, 4, 4, 5 };

		int size = removeDuplicates(arr, arr.length);
		for (int i = 0; i < size; i++)
			System.out.print(arr[i]);
	}

//	O(n) time O(1) aux space
	private static int removeDuplicates(int[] arr, int length) {
		int size = length;
		int j=1;
		for (int i = 1; i < length ;i++) {
			if (arr[i] != arr[i - 1]) {
				arr[j]=arr[i];
				j++;
			}
			
		}

		return j;
	}

}
