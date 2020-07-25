/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class LCM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findLCM(24,18);
	}

	private static void findLCM(int i, int j) {
		System.out.println((i*j)/GCD.findHCF(i, j));
	}

}
