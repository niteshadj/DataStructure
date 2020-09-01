/**
 * 
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given an integer K and a queue of integers, we need to reverse the
 *         order of the first K elements of the queue, leaving the other
 *         elements in the same relative order.
 *
 */
public class ReverseKElementsQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(modifyQueue(q,3));
		

	}

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		int i = 0;
		while (i < k) {
			stack.push(q.poll());
			i++;
		}
		while (!q.isEmpty())
			q1.add(q.poll());

		while (!stack.isEmpty())
			q.add(stack.pop());
		while (!q1.isEmpty())
			q.add(q1.poll());

		return q;
	}
}
