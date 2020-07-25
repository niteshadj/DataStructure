/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         Given an array A of N positive numbers. The task is to find the first
 *         Equilibium Point in the array. Equilibrium Point in an array is a
 *         position such that the sum of elements before it is equal to the sum
 *         of elements after it.
 */
public class EquilibriumPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long arr[] = { 1, 3, 5, 2, 2};
		System.out.println(equilibriumPoint(arr, arr.length));
	}

	//calculate prefix and postfix sum at each index , if it is same then its equilibrium point
	public static int equilibriumPoint(long a[], int n) {

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		long postFixSum = sum;
		long preFixSum = a[0];
		if (postFixSum == preFixSum)
			return 1;
		for (int i = 1; i < n; i++) {
			preFixSum=preFixSum+a[i];
			postFixSum=postFixSum-a[i-1];
			if (postFixSum == preFixSum)
				return (i+1);
		}

		return -1;
	}

}
