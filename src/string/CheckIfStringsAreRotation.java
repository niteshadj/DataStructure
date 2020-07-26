/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given two strings s1 and s2. The task is to check if s2 is a rotated
 *         version of the string s1. The characters in the strings are in
 *         lowercase.
 *
 */
public class CheckIfStringsAreRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static boolean areRotations(String s1, String s2) {
		String s3=s1+s1;
		if(s1.length()!=s2.length())
			return false;
		return s3.contains(s2);
	}

}
