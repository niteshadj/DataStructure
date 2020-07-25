/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class SnakePattern {

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
			print(a, n);
			System.out.println();
		}

	}
	
	static void print(int a[][], int n)
    {
		for(int i=0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
			}
			else{
				for(int j=n-1;j>=0;j--){
					System.out.print(a[i][j]+" ");
				}
			}
		}
    }

}
