/**
 * 
 */
package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Implement a Stack using two queues q1 and q2.
 *
 */
public class StackUsingTwoQueues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackUsingTwoQueues sq = new StackUsingTwoQueues();
		sq.push(2);
		sq.push(3);
		System.out.println(sq.pop());
		sq.push(4);
		System.out.println(sq.pop());
	}

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	/* The method pop which return the element poped out of the stack */
	int pop() {
		if (q1.isEmpty())
			return -1;
		while (q1.size() != 1)
			q2.add(q1.poll());
		int res = q1.poll();
		while (!q2.isEmpty())
			q1.add(q2.poll());
		return res;
	}

	/* The method push to push element into the stack */
	void push(int a) {
		q1.add(a);
	}

}
