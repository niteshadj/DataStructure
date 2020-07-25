/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class PrimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isPrime(25));
	}

	public static boolean isPrime(double d) {
		
		if(d==1)
			return false;
		
		if(d==2||d==3){
			return true;
		}
		 if (d%2 == 0 || d%3 == 0) return false; 
		  
		for(int i=5;i<=Math.sqrt(d);i=i+6){
			if(d%i==0 || d%(i+2)==0)
				return false;
		}
		
		return true;
	}

}
