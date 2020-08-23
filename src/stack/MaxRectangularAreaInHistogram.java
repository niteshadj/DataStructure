/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Find the largest rectangular area possible in a given histogram where
 *         the largest rectangle can be made of a number of contiguous bars. For
 *         simplicity, assume that all bars have the same width and the width is
 *         1 unit.
 *
 */
public class MaxRectangularAreaInHistogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println(getMaxArea(hist, hist.length));

	}

	// First think solution of forming two arrays one with prev low for each
	// element and second for next low of each element
	public static long getMaxArea(long hist[], long n) {
		long res = 0;
		Stack<Integer> stack = new Stack<>();
		long currArea = 0;
		for (int i = 0; i < hist.length; i++) {

			while (!stack.isEmpty() && hist[stack.peek()] >= hist[i]) {

				long a = hist[stack.pop()];
				if (stack.isEmpty()) {
					currArea = a * i;
				} else {
					currArea = a * (i - stack.peek() - 1);
				}

				res = Math.max(res, currArea);
			}

			stack.push(i);
		}

		while (!stack.isEmpty()) {
			long a = hist[stack.pop()];
			if (stack.isEmpty()) {
				currArea = n * a;
			} else {
				currArea = (n - stack.peek() - 1) * a;

			}
			res = Math.max(res, currArea);
		}

		return res;
	}

}
