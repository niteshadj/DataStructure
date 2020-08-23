/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given an array A[] of size N having distinct elements, the task is to
 *         find the next greater element for each element of the array in order
 *         of their appearance in the array.
 * 
 *         Next greater element of an element in the array is the nearest
 *         element on the right which is greater than the current element.
 * 
 *         If there does not exist next greater of current element, then next
 *         greater element for current element is -1. For example, next greater
 *         of the last element is always -1.
 *
 */
public class NextLargerElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static long[] nextLargerElement(long[] arr, int n) {

		long[] resArr = new long[arr.length];

		Stack<Integer> stack = new Stack<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			int prevHigh = -1;
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
				stack.pop();
			if (!stack.isEmpty()) {
				prevHigh = stack.peek();
			}
			if (prevHigh == -1)
				resArr[i] = -1;
			else{
				resArr[i]=arr[prevHigh];
			}
			if (stack.isEmpty() || arr[stack.peek()] > arr[i]) {
				stack.push(i);
			}

		}

		return resArr;

	}

}
