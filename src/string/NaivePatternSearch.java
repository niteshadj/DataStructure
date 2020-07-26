/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a string S and a pattern P both of lowercase characters. The
 *         task is to check if the given pattern exists in the given string or
 *         not.
 *
 */
public class NaivePatternSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	static boolean search(String pat, String txt)
    {
		return txt.contains(pat);
    }

}
