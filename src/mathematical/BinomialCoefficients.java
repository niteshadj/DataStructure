/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class BinomialCoefficients {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 400;
		int r = 35;
		System.out.printf("%f",findBinomialCoeffEfficient(n,r));
		// System.out.println(findBinomialCoefficient(n, r));
		/*double c[][] = new double[n + 1][r + 1];
		c[0][0] = 1;
		c[n][0] = 1;
		findBinomialCoefficientEfficient(n, r, c);
		System.out.printf("%f", c[n][r]);*/

	}

	//TopDownDP
	private static double findBinomialCoefficientEfficient(int n, int r, double[][] c) {
		if (r == 0 || r == n) {
			return 1;
		}

		if (c[n][r] == 0) {

			c[n][r] = (findBinomialCoefficientEfficient(n - 1, r, c)
					+ findBinomialCoefficientEfficient(n - 1, r - 1, c));

		}
		return c[n][r];

	}

	private static int findBinomialCoefficient(int n, int r) {
		if (r == 0 || r == n) {
			return 1;
		}
		return (findBinomialCoefficient(n - 1, r) + findBinomialCoefficient(n - 1, r - 1));
	}

	//BottomUp DP
	static double findBinomialCoeffEfficient(int n, int r) {
		double c[][] = new double[n + 1][r + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, r); j++) {
				if(j==0||j==i){
					c[i][j]=1;
				}
				else{
					c[i][j]=c[i-1][j-1]+c[i-1][j];
				}
				
			}
		}
		
		return c[n][r];
	}

}
