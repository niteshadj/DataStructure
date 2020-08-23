/**
 * 
 */
package stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given an infix expression in the form of string str. Conver this
 *         infix expression to postfix expression.
 * 
 *         Infix expression: The expression of the form a op b. When an operator
 *         is in-between every pair of operands. Postfix expression: The
 *         expression of the form a b op. When an operator is followed for every
 *         pair of operands. ​Note: The order of precedence is: ^ greater than *
 *         equals to / greater than + equals to -.
 *
 */
public class InfixToPostFix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(infixToPostfix("A*(B+C)/D"));
	}

	public static String infixToPostfix(String exp) {
		String res = "";
		Stack<Character> stack = new Stack<>();
		HashMap<Character, Integer> map = new HashMap<>(5);

		map.put('^', 3);
		map.put('*', 2);
		map.put('/', 2);
		map.put('+', 1);
		map.put('-', 1);
		map.put('(', 0);

		for (int i = 0; i < exp.length(); i++) {

//			System.out.println(res);
			if (exp.charAt(i) == '(') {
				stack.push('(');
				continue;
			}

			if (exp.charAt(i) == ')') {
				char a = stack.pop();
				while (a != '(') {

					res = res + a;
					a = stack.pop();
				}
				continue;
			}

			if (map.containsKey(exp.charAt(i))) {
				if (stack.isEmpty() || map.get(stack.peek()) < map.get(exp.charAt(i)))
					stack.push(exp.charAt(i));
				else {
					while (!stack.isEmpty()&&map.get(stack.peek()) >= map.get(exp.charAt(i)))
						res = res + stack.pop();
					stack.push(exp.charAt(i));
				}
			} else {
				res = res + exp.charAt(i);
			}

		}
		
		while(!stack.isEmpty()){
			res=res+stack.pop();
		}

		return res;
	}

}
