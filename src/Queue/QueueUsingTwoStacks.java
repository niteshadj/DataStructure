/**
 * 
 */
package Queue;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Implement a Queue using 2 stacks s1 and s2 . A Query Q is of 2 Types
 *         (i) 1 x (a query of this type means pushing 'x' into the queue) (ii)
 *         2 (a query of this type means to pop element from queue and print the
 *         poped element)
 *
 */
public class QueueUsingTwoStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class StackQueue {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	/*
	 * The method insert to push element into the queue
	 */
	void Push(int x) {
		s1.push(x);
	}

	/*
	 * The method remove which return the element popped out of the queue
	 */
	int Pop() {
		while (!(s1.size() == 1)) {
			s2.push(s1.pop());
		}
		int a = s1.pop();

		while (!(s2.isEmpty())) {
			s1.push(s2.pop());
		}
		return a;
	}
}