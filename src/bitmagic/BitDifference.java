/**
 * 
 */
package bitmagic;

/**
 * @author xoradjriya
 *
 */
public class BitDifference{

	/**
	 * @param args
	 */
	public static void maixor(String[] args) {
		
		System.out.print(countBitsFlip(10, 20));
	}

	private static int countBitsFlip(int i, int j) {
		int xor=i^j;
		int count = 0;
		while (xor > 0) {
			xor = xor & (xor - 1);// turns off leftmost set bit
			count++;
		}
		return count;
	}

}
