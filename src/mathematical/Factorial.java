/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(factorial(120));
		System.out.println((int)noOfDigitsInFact(120));
		System.out.println(termOfGP(84, 87, 3));

	}

	private static int noOfDigitsInFact(int n) {
		double res=0;
		for(int i=n;i>0;i--){
			res= res+Math.log10(i);
			
		}
		
		return (int) (Math.floor(res)+1);
	}

	private static long factorial(int n) {
		long fact=1;
		for(int i=n;i>1;i--){
			fact=fact*i;
		}
		
		return fact;
		
	}
	
	public static double termOfGP(int A,int B,int N)
    {
		if(N==1){
			return A;
		}
		if(N==2){
			return B;
		}
		
		double r=(double)B/(double)A;
		return (A*Math.pow(r, N-1));
		
    }

}
