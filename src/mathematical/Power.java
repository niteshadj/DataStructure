/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// System.out.println(findPower(3,4));

		System.out.println(findPowerEfficient(3, 5));

	}

	// O(Y)
	private static int findPower(int x, int y) {

		int res = 1;

		for (int i = 1; i <= y; i++) {
			res = res * x;
		}

		return res;

	}

	// O(LogY)
	private static int findPowerEfficient(int x, int y) {

		int res = 1;

		for (int i = y; i >= 1; i = i / 2) {
			if (i % 2 != 0)
				res = res * x;

			x = x * x;

		}

		return res;

	}

}
