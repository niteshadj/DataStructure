/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 *
 */
public class StackOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static void insert(Stack<Integer> st, int x) {
		st.push(x);
	}

	// Function to pop element from stack
	public static void remove(Stack<Integer> st) {
		int x = st.pop();

	}

	// Function to return top of stack
	public static void headOf_Stack(Stack<Integer> st) {
		int x = st.peek();
		System.out.println(x + " ");
	}

	// Function to find the element in stack
	public static boolean find(Stack<Integer> st, int val) {
		boolean exists = false;

		exists = st.contains(val);
		if (exists == true) {
			return true;
		} else {
			return false;
		}

	}

}
