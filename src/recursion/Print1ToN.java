/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class Print1ToN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printNos(64);
		
	}

	public static void printNos(int N) {
		if (N == 1) {
			System.out.println(1);
			return;
		}
		printNos(N - 1);
		System.out.println(N);
	}

}
