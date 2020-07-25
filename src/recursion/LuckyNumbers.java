/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class LuckyNumbers {

	/**
	 * @param args
	 */
	static int counter = 2;

	public static void main(String[] args) {

		System.out.println(isLucky(19));

	}

	private static boolean isLucky(int n) {
		
		if(counter>n){
			return true;
		}

		if (n % counter == 0) {
			return false;
		}
		int i=counter;
		counter++;
		return isLucky((n-n/i));
		
//		counter++;

	}

}
