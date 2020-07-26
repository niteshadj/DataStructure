/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a String of length S, reverse the whole string without
 *         reversing the individual words in it. Words are separated by dots.
 *
 */
public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverseWords("i.like.this.program.very.much");
	}

	public static void reverseWords(String sd) {
		String arr[]=sd.split("[.]");
		for(int i=arr.length-1;i>0;i--){
			System.out.print(arr[i]+".");
		}
		System.out.print(arr[0]);
	}

}
