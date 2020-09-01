/**
 * 
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given a Deque dqe of size N containing non-negative integers.
 * 
 *         Complete below functions depending type of query as mentioned and
 *         provided to you (indexing starts from 0): 1. eraseAt(X): this
 *         function should remove the element from specified position X in
 *         deque. 2. eraseInRange(start, end): this function should remove the
 *         elements in range start (inclusive), end (exclusive) specified in the
 *         argument of the function. Note: If start is equal to end then simply
 *         return. 3. eraseAll(): remove all the elements from the deque.
 *
 */
public class DequeueDeletion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void eraseAt(ArrayDeque<Integer> deq , int X)
	{
		Stack<Integer> stack=new Stack<>();
		int i=0;
		while(i<X){
			stack.push(deq.pollFirst());
			i++;
		}
		deq.pollFirst();
		while(!stack.isEmpty()){
			deq.addFirst(stack.pop());
		}
	}

	public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
	{
		if(start!=end){
			Stack<Integer> stack=new Stack<>();
			int i=0;
			while(i<start){
				stack.push(deq.pollFirst());
				i++;
			}
			
			while(i<end){
				deq.pollFirst();
				i++;
			}
			
			while(!stack.isEmpty()){
				deq.addFirst(stack.pop());
			}
			
		}
		
	}

	public static void eraseAll(ArrayDeque<Integer> deq )
	{
		while(!deq.isEmpty())
			deq.remove();
	}

}
