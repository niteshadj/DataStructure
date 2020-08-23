/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Stacks can be used to remove duplicate characters from a string that
 *         are stacked next to each other. For example, we take the string
 *         aabbccccc and convert it into abc. We can push the first character
 *         into a stack and skip if the top of the stack is equal to the current
 *         character.
 * 
 *         You are given string str. You need to remove the consecutive
 *         duplicates from the given string using a Stack.
 *
 */
public class RemoveDuplicatesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("abbccbcd"));

	}

	public static String removeConsecutiveDuplicates(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (stack.isEmpty() || str.charAt(i) != stack.peek())
				stack.push(str.charAt(i));
		}
		str = "";
		while (!stack.isEmpty()) {
			str =  stack.pop()+str ;
		}

		return str;

	}

}
