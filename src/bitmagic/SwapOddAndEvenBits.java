/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class SwapOddAndEvenBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(swapBits(23));
	}

	 public static int swapBits(int n) {
		    
		 return ((n & 0xAAAAAAAA)>>1) |((n& 0x55555555)<<1);
		 
		}
}
