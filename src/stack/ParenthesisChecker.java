/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given an expression string x. Examine whether the pairs and the
 *         orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example,
 *         the function should return 'true' for exp = “[()]{}{[()()]()}” and
 *         'false' for exp = “[(])”.
 *
 */
public class ParenthesisChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ispar("([])}"));

	}

	static boolean ispar(String x) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[')
				stack.push(x.charAt(i));
			else {
				if (stack.isEmpty())
					return false;
				char poppedItem = stack.pop();
				if (!isMatching(poppedItem, x.charAt(i)))
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;

		return true;

	}

	private static boolean isMatching(char poppedItem, char item) {

		if (poppedItem == '(' && item == ')')
			return true;
		else if (poppedItem == '{' && item == '}')
			return true;
		else if (poppedItem == '[' && item == ']')
			return true;
		return false;
	}

}
