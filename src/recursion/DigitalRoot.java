/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class DigitalRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(digitalRoot(191));

	}

	public static int digitalRoot(int n) {
		
		if(n/10==0){
			return n;
		}
		
		return digitalRoot(findSumOfDigitsOfNum(n));
	
	}

	private static int findSumOfDigitsOfNum(int n) {

		if (n / 10 == 0) {
			return (n);
		}

		return findSumOfDigitsOfNum(n / 10)+( n % 10);

	}

}
