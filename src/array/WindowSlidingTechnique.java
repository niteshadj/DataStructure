/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 */
public class WindowSlidingTechnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1,8,30,-5,20,7 };
		int sum = findMaxSumSubArrayKLength(arr, 3);
		System.out.println(sum);
	}

	//O(n) time O(1) aux space
	private static int findMaxSumSubArrayKLength(int[] a, int k) {

		int maxSum = 0;
		int prevWindSum = 0;

		for (int i = 0; i < k; i++) {
			prevWindSum = prevWindSum + a[i];

		}
		maxSum = Math.max(prevWindSum,maxSum);

		for (int i = 0; (i + k) < a.length; i++) {
			prevWindSum=prevWindSum-a[i]+a[i+k];
			maxSum = Math.max(prevWindSum,maxSum);
		}

		return maxSum;
	}

}
