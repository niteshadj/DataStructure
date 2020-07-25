/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 */
public class MaximumSumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 3, -10, 6, 4, -8, 1 };
		int sum = findMaxSumSubarray(arr);

		System.out.println(sum);
	}

	//Kadene Algo
	private static int findMaxSumSubarray(int[] a) {
		int maxEndingSum = a[0];
		int res =maxEndingSum;
		for (int i = 1; i < a.length; i++) {
		maxEndingSum=	Math.max(maxEndingSum+a[i],a[i]);
		res=Math.max(maxEndingSum, res);
		}

		return res;
	}

}
