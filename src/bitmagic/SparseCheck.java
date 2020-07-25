/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class SparseCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isSparse(24));
	}

	// can also be done by n&(n>>1)
	public static boolean isSparse(int n) {
		int prevBit = 0;
		if ((n & 1) == 1) {
			prevBit = 1;
		}
		n = n >> 1;
		while (n > 0) {
			if ((prevBit & n) == 1) {
				return false;
			}
			prevBit=n&1;
			n=n>>1;
		}

		return true;

	}

}
