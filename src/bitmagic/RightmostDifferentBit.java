/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class RightmostDifferentBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 11, m = 9;
		findRightmostDifferentBit(n, m);

	}

	private static void findRightmostDifferentBit(int n, int m) {

		int xor = n ^ m;

		if (xor == 0) {
			System.out.println(-1);
		}

		int count = 1;

		while (xor > 0) {
			if ((xor & 1) == 1) {
				System.out.println(count);
				break;
			}
			count++;
			xor=xor>>1;
		}

	}

}
