/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         Given an array arr[] of N non-negative integers representing the
 *         height of blocks at index i as Ai where the width of each block is 1.
 *         Compute how much water can be trapped in between blocks after
 *         raining.
 *         
 *
 */
public class TrappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 8, 8, 2, 4, 5, 5, 1 };
		System.out.println(trappingWater(arr, arr.length));
	}

	static int trappingWater(int a[], int n) {
		int result = 0;
		int lmaxArr[] = new int[n];
		int max = a[0];
		for (int i = 0; i < n; i++) {
			lmaxArr[i] = Math.max(max, a[i]);
			max = lmaxArr[i];
		}
		int rmaxArr[] = new int[n];
		max = a[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			rmaxArr[i] = Math.max(max, a[i]);
			max = rmaxArr[i];
		}

		for (int i = 0; i < n; i++) {
			result = result + (Math.min(lmaxArr[i], rmaxArr[i])) - a[i];
		}

		return result;

	}

}
