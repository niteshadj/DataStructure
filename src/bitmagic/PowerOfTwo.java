/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=255;
		isPowerOf2(n);
	}

	//no of set bits should be 1
	private static void isPowerOf2(int n) {
		if(n==0){
			System.out.println(false);
		}
		
		if((n&(n-1))==0){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
	}

}
