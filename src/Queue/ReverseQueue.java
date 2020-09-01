/**
 * 
 */
package Queue;

import java.util.Queue;

/**
 * @author nadjriya
 *
 */
public class ReverseQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public Queue<Integer> rev(Queue<Integer> q) {
		if (q.isEmpty())
			return q;
		int a = q.poll();
		rev(q);
		q.add(a);
		return q;
	}

}
