/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         You are given a matrix A of dimensions n1 x m1. You have to exchange
 *         A's first column with last column.
 *
 */
public class ExchangeColumns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n1 = sc.nextInt();
			int m1 = sc.nextInt();
			int a[][] = new int[n1][m1];
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < m1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			exchangeColumns(n1, m1, a);
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < m1; j++) {
					System.out.print(a[i][j] );
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	static void exchangeColumns(int n1, int m1, int a[][]) {
		
		if(m1==1){
			return;
		}
		int temp=0;
		for(int i=0;i<n1;i++){
			temp=a[i][0];
			a[i][0]=a[i][m1-1];
			a[i][m1-1]=temp;
			
		}
	}

}
