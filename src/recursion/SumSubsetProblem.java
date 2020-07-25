/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class SumSubsetProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 10, 20, 15,5 };
		int sum = 25;
		System.out.println(findSumSubset(arr, arr.length, sum));
	}

	private static int findSumSubset(int[] arr, int length, int sum) {

		if (length == 0) {
			return (sum == 0 ? 1 : 0);
		}

		return (findSumSubset(arr, length - 1, sum) + findSumSubset(arr, length - 1, sum - arr[length - 1]));

	}

}
