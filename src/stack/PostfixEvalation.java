/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given a string representing a postfix expression, the task is to
 *         evaluate the expression and print the final value. Operators will
 *         only include the basic arithmetic operators like *,/,+ and -.
 *
 */
public class PostfixEvalation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(evaluatePostFix("123+*8-"));
	}

	public static int evaluatePostFix(String exp) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) {
			int a,b=0;
			if (exp.charAt(i) == '*') {
				a=stack.pop();
				b=stack.pop();
				stack.push(b * a);
			} else if (exp.charAt(i) == '/') {
				a=stack.pop();
				b=stack.pop();
				stack.push(b/a);

			} else if (exp.charAt(i) == '+') {
				a=stack.pop();
				b=stack.pop();
				stack.push(b+a);

			} else if (exp.charAt(i) == '-') {
				a=stack.pop();
				b=stack.pop();
				stack.push(b-a);

			} else {
				stack.push(Character.getNumericValue(exp.charAt(i)));
			}
		}

		return stack.pop();
	}

}
