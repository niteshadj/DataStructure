/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class SearchInMat {

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
			int x=sc.nextInt();
			System.out.println(search(n1, m1, a,x));
		}
	}
	
	static int search(int n1, int m1, int a[][], int x)
    {
		if(x<a[0][0])
			return 0;
		else if(x>a[n1-1][m1-1])
			return 0;
		else{
			int i=0;
			int j=m1-1;
			while(j>=0 && i<n1){
				if(x==a[i][j])
					return 1;
				else if(x<a[i][j])
					j--;
				else
					i++;
			}
		}
		
      return 0;
    }
	
}
