/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         The cost of stock on each day is given in an array A[] of size N.
 *         Find all the days on which you buy and sell the stock so that in
 *         between those days your profit is maximum.
 *
 */
public class StockBuyAndSell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 11,42,49,96,23,20,49,26,26,18,73,2,53,59,34,99,25,2 };
		stockBuySell(arr, arr.length);
	}

	// Function to find the buy and sell days and print them
	static void stockBuySell(int price[], int n) {
		StringBuffer sb = new StringBuffer();
		boolean findBuy = true;
		for (int i = 0; i < n - 1; i++) {

			if (!findBuy && ((price[i] > price[i + 1]))) {
				sb.append(i + ") ");
				findBuy = true;
			}
			if (findBuy && price[i] < price[i + 1]) {
				sb.append("(" + i + " ");
				findBuy = false;
			}

		}

		if (sb.length() != 0 && sb.charAt(sb.length() - 2) != ')') {
			sb.append(n - 1 + ") ");
		}

		if (sb.length() != 0)
			System.out.print(sb);
		else {
			System.out.print("No Profit");
		}

	}

}
