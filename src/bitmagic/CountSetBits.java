/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class CountSetBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 255;
		System.out.println(countNoofSetBits(n));
		System.out.println(countNoofSetBitsEfficieint(n));

		int[] table = initializeLookUpTable();
		System.out.println(usingLookupTable(table, n));

	}

	// store set bits for 255 numbers (numbers that can be represented by 8
	// bits)
	private static int[] initializeLookUpTable() {

		int[] table = new int[256];
		table[0] = 0;
		for (int i = 1; i < 256; i++) {
			table[i] = (i & 1) + (table[i / 2]);
		}

		return table;
	}

	// theta(1) time
	private static int usingLookupTable(int[] table, int n) {
		int count = 0;

		count = count + table[n & 255];// set bits in last 8 bits
		n = n >> 8;
		count = count + table[n & 255];
		n = n >> 8;
		count = count + table[n & 255];
		n = n >> 8;
		count = count + table[n & 255];

		return count;
	}

	// Thetha(total set bits) Brian Kerningam's algo
	private static int countNoofSetBitsEfficieint(int n) {
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);// turns off leftmost set bit
			count++;
		}
		return count;
	}

	// Thetha(total bits in n)
	private static int countNoofSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count = count + (n & 1);
			n = n >> 1;
		}
		return count;
	}

}
