/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 * 
 *         You are given a number n. You need to find the sum of digits of n.
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findSumOfDigitsOfNum(135, 0));

	}

	private static int findSumOfDigitsOfNum(int n, int sum) {

		if (n / 10 == 0) {
			return (sum + n);
		}

		return findSumOfDigitsOfNum(n / 10, (sum + (n % 10)));

	}

}
