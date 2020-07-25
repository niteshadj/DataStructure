/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class ConsecutiveOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(maxConsecutiveOnes(222));
	}

	 public static int maxConsecutiveOnes(int n) {
	       int output=1;
	       if(n==0){
	    	   return 0;
	       }
	       
	       int prevBit = 0;
			if ((n & 1) == 1) {
				prevBit = 1;
			}

			
			int count=1;
			while (n >0) {
				n = n >> 1;
				if ((prevBit & n) == 1) {
					count++;
				}
				else{
					if(count>output){
						output=count;
					}
					count=1;
				}
				prevBit=n&1;
			}
		 
		 System.out.println(count);
		 return output;
	    }
}
