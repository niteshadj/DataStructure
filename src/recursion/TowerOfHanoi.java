/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class TowerOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TOH(3,'a','b','c');
		
		
	}

	//no of movements=2^n-1 , O(n)
	private static void TOH(int n, char a, char b, char c) {
		
		if(n==1){
			System.out.println("Move 1 from "+a+" to "+c);
			return;
		}
		
		TOH(n-1, a, c, b);
		System.out.println("Move "+n +" from "+a+" to "+c);
		
		TOH(n-1, b, a, c);
		
	}

}
