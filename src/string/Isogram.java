/**
 * 
 */
package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nadjriya
 *
 */
public class Isogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isIsogram("geeks"));
	}
	
	static boolean isIsogram(String data){
		Set<Character> charSet=new HashSet<>();
		for(int i=0;i<data.length();i++){
			if(charSet.contains(data.charAt(i)))
				return false;
			charSet.add(data.charAt(i));
		}
		return true;
	}

}
