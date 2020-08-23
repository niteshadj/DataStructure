/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given a stack with push(), pop(), empty() operations, delete the
 *         middle of it without using any additional data structure. Middle:
 *         ceil(size_of_stack/2.0)
 *
 */
public class DeleteMiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Stack<Integer> deleteMid(Stack<Integer> s, int sizeOfStack, int current) {
		if (Math.ceil(sizeOfStack / 2) == current) {
			s.pop();
			return s;
		}
		int a = s.pop();
		current++;
		deleteMid(s, sizeOfStack, current);

		s.push(a);

		return s;

	}

}
