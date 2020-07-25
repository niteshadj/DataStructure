/**
 * 
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         Given an array A of positive integers. Your task is to find the
 *         leaders in the array.
 * 
 *         Note: An element of array is leader if it is greater than or equal to
 *         all the elements to its right side. Also, the rightmost element is
 *         always a leader.
 *
 */
public class Leaders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 2, 2 };
		System.out.println(leaders(arr, arr.length));
	}

	static ArrayList<Integer> leaders(int a[], int n) {
		
		ArrayList<Integer> leaders=new ArrayList<>();
		int max=0;
		for(int i=n-1;i>=0;i--){
			if(max<a[i]){
				leaders.add(a[i]);
				max=a[i];
			}
		}
		
		Collections.reverse(leaders);
		return leaders;
		
	}

}
