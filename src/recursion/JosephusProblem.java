/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class JosephusProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findOnlySurviving(3, 2));
	}

	public static int findOnlySurviving(int n, int k) {
		if (n == 1) {
			return 0;
		}

		return ((findOnlySurviving(n - 1, k) + k) % n);
	}

}
