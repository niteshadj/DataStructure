/**
 * 
 */
package array;

import java.util.Arrays;

/**
 * @author nadjriya
 * 
 *         Given a sorted array of positive integers. Your task is to rearrange
 *         the array elements alternatively i.e first element should be max
 *         value, second should be min value, third should be second max, fourth
 *         should be second min and so on.
 *
 */
public class RearrangeAlternate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10,20,30,40,50,60,70,80,90,100,110 };
		rearrange(arr, arr.length);
		/*System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print((arr[i])%(arr[arr.length-1]+1) + " ");
		}*/
	}
	
	 public static void rearrange(int a[], int n){
	     
		 int max=a[n-1]+1;
		 int j=n-1;
		 
		 for(int i =0;i<n;){
			 a[i]=(a[j]%max)*max +a[i]%max;
			 j--;
			 i=i+2;
		 }
		 j=0;
		 for(int i =1;i<n;){
			 a[i]=(a[j]%max)*max +a[i]%max;
			 i=i+2;
			 j++;
		 }
		 for (int i = 0; i <n; i++) {
				a[i]=(a[i])/(max);
			}
		 
	    }

	
}
