/**
 * 
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class BasicOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicOperations operations=new BasicOperations();
		Scanner sc=new Scanner(System.in);
		int noOfTestcases=sc.nextInt();
		while(noOfTestcases>0){
			
			int sizeOfArray=sc.nextInt();
			int [] arr=new int[sizeOfArray];
			for(int i=0;i<sizeOfArray-1;i++){
				arr[i]=sc.nextInt();
				
			}
			int index=sc.nextInt();
			int element=sc.nextInt();
			operations.insertAtIndex(arr, sizeOfArray, index, element);
			for(int i=0;i<sizeOfArray;i++){
				System.out.print(arr[i]+" ");
				
			}
			System.out.println();
			noOfTestcases--;
		}
	

	}
	
	public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
		int i=0;
		for(i=sizeOfArray-1;i>index;i--){
			
			arr[i]=arr[i-1];
			
		}
		arr[i]=element;
    }
	
	public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       if((N%2) !=0){
    	   return A[(int)Math.floor(N/2)];
       }
       else{
    	   return (A[N/2]+A[N/2 -1])/2;
       }
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    
    public int mean(int A[],int N)
    {
    	int sum=0;
    	for(int i=0;i<N;i++){
    		sum=sum+A[i];
    	}
    	
    	return Math.floorDiv(sum, N);
    }

}
