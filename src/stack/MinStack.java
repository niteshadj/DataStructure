/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         You are given an array A of size N. You need to first push the
 *         elements of the array into a stack and then print minimum in the
 *         stack at each pop.
 *
 */
public class MinStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Stack<Integer> minSt = new Stack<>();

	public static Stack<Integer> _push(int arr[], int n) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(arr[i]);
			if (minSt.isEmpty() || minSt.peek() >= arr[i]) {
				minSt.push(arr[i]);
			}
		}
		return st;
	}

	/*
	 * print minimum element of the stack each time after popping
	 */
	static void _getMinAtPop(Stack<Integer> s) {

		while (!s.isEmpty()) {
			int a = s.pop();
			System.out.println(minSt.peek() + " ");
			if (a == minSt.peek())
				minSt.pop();
		}

	}

}
