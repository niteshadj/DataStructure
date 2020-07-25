/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class StringPowerSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		findStringPowerSet("ABC", "", 0);

	}

	private static void findStringPowerSet(String a, String curr, int i) {
		
		if(i >=a.length()){
			System.out.println(curr);
			return;
		}
		findStringPowerSet(a, curr, i + 1);
		findStringPowerSet(a, curr + a.charAt(i), i + 1);

	}

}
