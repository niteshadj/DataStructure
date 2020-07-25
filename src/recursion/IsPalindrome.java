/**
 * 
 */
package recursion;

/**
 * @author nadjriya
 *
 */
public class IsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s="madamInEdenImAdam";
		System.out.println(s.length());
		
		System.out.println(isPalindrome(s.toLowerCase()));
		
	}

	private static boolean isPalindrome(String s) {
		if(s.length()==1){
			return true;
		}
		if(s.isEmpty()){
			return true;
		}
		if(s.charAt(0)!=s.charAt(s.length()-1)){
			return false;
		}
		return  isPalindrome(s.substring(1, s.length()-1));
		
	}

}
