/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         The stock span problem is a financial problem where we have a series
 *         of n daily price quotes for a stock and we need to calculate the span
 *         of stock�s price for all n days. The span Si of the stock�s price on
 *         a given day i is defined as the maximum number of consecutive days
 *         just before the given day, for which the price of the stock on the
 *         current day is less than or equal to its price on the given day. For
 *         example, if an array of 7 days prices is given as {100, 80, 60, 70,
 *         60, 75, 85}, then the span values for corresponding 7 days are {1, 1,
 *         1, 2, 1, 4, 6}.
 *
 */
public class StockSpanProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] calculateSpan(int price[], int n) {

		int[] span = new int[price.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < price.length; i++) {
			int prevHigh = -1;
			while (!stack.isEmpty() && price[stack.peek()] <= price[i])
				stack.pop();
			if (!stack.isEmpty()) {
				prevHigh = stack.peek();
			}

			span[i] = i - prevHigh;
			if (stack.isEmpty() || price[stack.peek()] >price[i]) {
				stack.push(i);
			}

		}

		return span;

	}

}
