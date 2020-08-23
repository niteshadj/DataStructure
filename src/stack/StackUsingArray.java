/**
 * 
 */
package stack;

/**
 * @author nadjriya
 * 
 *         Write a program to implement a Stack using Array.
 *
 */
public class StackUsingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int top;
	int arr[] = new int[1000];

	StackUsingArray() {
		top = -1;
	}

	/*
	 * The method push to push element into the stack
	 */
	void push(int a) {

		arr[top + 1] = a;
		top++;
	}

	/*
	 * The method pop which return the element poped out of the stack
	 */
	int pop() {

		if (top == -1)
			return top;
		return arr[top--];

	}

}
