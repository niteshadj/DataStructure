/**
 * 
 */
package array;

import java.util.ArrayList;

/**
 * @author nadjriya
 *
 */
public class ReverseInGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> mv=new ArrayList<>();
		mv.add(1);
		mv.add(2);
		mv.add(3);
		mv.add(4);
		mv.add(5);
		mv.add(6);
		
		System.out.println(reverseInGroups(mv, mv.size(), 3));
	}
	
	 public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
		 
		 ArrayList<Integer> list=new ArrayList<>();
		 int i=0;
		while((i+k)<n){
		 for(int j=i+k-1;j>=i;j--){
			 list.add(mv.get(j));
		 }
		 i=i+k;
		}
		
		for(int j=n-1;j>=i;j--){
			 list.add(mv.get(j));
		 }
		 
		 return list;
	        
	    }

}
