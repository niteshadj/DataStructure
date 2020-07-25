/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class StringPowerSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s ="ab";
		
		printStringPowerSet(s);
		
	}
//Thetha(2^n *n)
	private static void printStringPowerSet(String s) {
		
		for(int i =0;i<Math.pow(2, s.length());i++){
			int temp=i;
			for(int j=0;j<s.length();j++){
				if((temp&1)==1){
					System.out.print(s.charAt(j));
				}
				temp=temp>>1;
			}
			System.out.println();
		}
	}

}
