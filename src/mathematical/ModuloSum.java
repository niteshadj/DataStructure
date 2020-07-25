/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class ModuloSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumUnderModulo(9223372036854775807l , 9223372036854775807l));
		System.out.println(multiplicationUnderModulo(9223372036854775807l , 9223372036854775807l ));
		
	}
	
	 public static long sumUnderModulo(long a, long b)
	    {
	        int m=1000000007;
	      return  (a%m +b%m)%m;
	        
	    }  
	 
	 static long multiplicationUnderModulo(long a, long b)
	    {
		 
		 int m=1000000007;
	      return  ((a%m) * (b%m))%m;
		 
	    }
	 
	 public int modInverse(int a, int m)
	    {
		 for(int i=1;i<m;i++){
			if (((a%m) * (i%m))%m==1){
				return i;
			}
		 }
	      return -1;
	    }

}
