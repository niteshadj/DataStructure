/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class PowerUsingRecusrion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(RecursivePower(9,9));
		
	}
	
	static int RecursivePower(int n,int p)
    {
		if(p==1){
			return n;
		}
		if(p==0){
		    return 1;
		}
		return n*RecursivePower(n, p-1);
    }

}
