/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class GreyConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(greyConverter(7));
		System.out.println(greyToBinaryConvertor(4));

	}

	private static int greyToBinaryConvertor(int n) {
		int prevBit=n&1;
		
		while(n>0){
			n=n>>1;
			if((n&1)==1){
				
			}
		}
		
		
		return 0;
	}

	static int greyConverter(int x) {

		return x ^ (x >> 1);

	}

}
