/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given a square matrix mat[][] of size N*N, print the sum of upper and
 *         lower triangular elements. Upper Triangle consists of elements on the
 *         diagonal and above it. Lower triangle consists of elements on the
 *         diagonal and below it.
 *
 */
public class SumTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			Summatrix(a, n);
			System.out.println();
		}
	}

	static void Summatrix(int mat[][], int n) {
		int upperSum=0;
		int lowerSum=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				upperSum=upperSum+mat[i][j];
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=i;j>=0;j--){
				lowerSum=lowerSum+mat[i][j];
			}
		}
		System.out.print(upperSum+" "+lowerSum);
	}

}
