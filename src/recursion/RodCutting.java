/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class RodCutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findMaxCuts(5, 2, 1, 5));

	}

	private static int findMaxCuts(int n, int a, int b, int c) {

		if (n == 0) {
			return 0;
		}
		if (n < 0) {
			return -1;
		}

		if (Math.max(Math.max(findMaxCuts(n - a, a, b, c), findMaxCuts(n - b, a, b, c)),
				findMaxCuts(n - c, a, b, c)) >= 0) {
			return (Math.max(Math.max(findMaxCuts(n - a, a, b, c), findMaxCuts(n - b, a, b, c)),
					findMaxCuts(n - c, a, b, c)) +1);
		} else
			return Math.max(Math.max(findMaxCuts(n - a, a, b, c), findMaxCuts(n - b, a, b, c)),
					findMaxCuts(n - c, a, b, c));

	}

}
