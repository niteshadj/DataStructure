/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class BitSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		isKthBitSet(i,4);
		
	}

	private static void isKthBitSet(int i, int j) {
		
		if(j>32){
			System.out.println("wrong input");
		}
		System.out.println(	(i>>(j-1)) & 1);
	
		
	}

}
