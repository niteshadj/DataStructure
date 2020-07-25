/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given a sorted array and a number x, find if any pair in array whose sum
 *         is equal to x
 *
 */
public class PairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5 };
		boolean sum = findSum(arr, 0, arr.length - 1, 8);
		System.out.println(sum);

	}

	private static boolean findSum(int[] a, int low, int high, int k) {
		int sum = -1;
		while (low < high) {
			sum = a[low ]+ a[high];
			if (sum == k)
				return true;
			else if(sum<k)
				low=low+1;
			else
				high=high-1;
			
		}
		return false;
	}

}
