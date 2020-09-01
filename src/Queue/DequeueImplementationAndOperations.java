/**
 * 
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * @author nadjriya
 * 
 *         A deque is a double-ended queue that allows enqueue and dequeue
 *         operations from both the ends.
 * 
 *         Given a deque and Q queries. The task is to perform some operation on
 *         dequeue according to the queries as given below: 1. pb: query to push
 *         back the element x. 2. pf: query to push element x(given with query)
 *         to the front of the deque. 3. pp_b(): query to delete element from
 *         the back of the deque. 4. f: query to return a front element from the
 *         deque.
 *
 */
public class DequeueImplementationAndOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Function to push element to front dq : dqueue in which element is to be
	 * pushed x : element to be pushed
	 */
	public static void push_back_pb(ArrayDeque<Integer> dq, int x) {

		dq.addLast(x);

	}

	/*
	 * Function to pop element from back dq : dqueue From which element is to be
	 * popped
	 */
	public static void pop_back_ppb(ArrayDeque<Integer> dq) {

		dq.pollLast();
	}

	/*
	 * Function to return element from front dq : dqueue from which element is
	 * to be returned
	 */
	public static int front_dq(ArrayDeque<Integer> dq) {
		if (dq.isEmpty())
			return -1;
		return dq.peek();

	}

	/*
	 * Function to push element to front dq : dqueue in which element is to be
	 * pushed x : element to be pushed
	 */
	public static void push_front_pf(ArrayDeque<Integer> dq, int x) {

		dq.addFirst(x);
	}

	/*
	 * Given a Deque Deq containing N elements, the task is to traverse the Deq
	 * and print the elements of it.
	 * 
	 */
	public static void printDeque(ArrayDeque<Integer> deq) {

		Iterator<Integer> iterator = deq.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

	// Given an array arr[] of size N containing non-negative integers. You need
	// to insert all elements of the array to deque and return it.
	public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		for(int i=0;i<n;i++){
			dq.add(arr[i]);
		}
		
		return dq;
	}

}
