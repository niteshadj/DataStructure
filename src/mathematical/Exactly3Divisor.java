/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class Exactly3Divisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(findSuchNoBelowN(49));
		
	}

	private static int findSuchNoBelowN(int n) {
		int count=0;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(PrimeTest.isPrime(i)){
				count++;
			}
		}
		return count;
	}

}
