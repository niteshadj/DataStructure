/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given an integer x, find it’s square root. If x is not a perfect
 *         square, then return floor(squareroot of x).
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findSqrt(0, 8, 18));
	}

	private static long findSqrt(long low, long high, long x) {
	     if(x==1)
	     return x;
		long ans = -1;
		while (low <= high) {
			long mid = (low + high) / 2;
			if (mid * mid == x)
				return mid;
			else if (mid * mid < x) {
				ans = mid;
				low = mid + 1;
			} else
				high = mid - 1;
		}

		return ans;

	}

}
