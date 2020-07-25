/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Two matrices A[][] and B[][] can only be multiplied if A's column
 *         size is equal to B's row size. The resultant matrix will have
 *         dimensions equal to A's row size and B's column size. You are given
 *         two matrices A and B. A is of dimension n1 x m1; and B is of
 *         dimension n2 x m2. You have to multiply A with B and print the
 *         resultant matrix. If multiplication is not possible then print -1.
 *
 */
public class MatrixMultiplication {

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
			int n2 = sc.nextInt();
			int m2 = sc.nextInt();
			int b[][] = new int[n2][m2];
			for (int i = 0; i < n2; i++) {
				for (int j = 0; j < m2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			multiplyMatrix(n1,m1,n2,m2,a,b);
			System.out.println();
		}

	}

	static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][]) {
		
		if(m1!=n2)
			System.out.print(-1);
		else{
			int a[][]= new int[n1][m2];
			for(int i=0;i<n1;i++){
				for(int k=0;k<m2;k++){
				int sum=0;
				for(int j=0;j<m1;j++){
				 sum=sum+	arr1[i][j] * arr2[j][k];
				}
				a[i][k]=sum;
				}
			}
			
			for(int i=0;i<n1;i++){
				for(int k=0;k<m2;k++){
					System.out.print(a[i][k]+" ");
				}}
		}
	}

}
