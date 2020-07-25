package recursion;

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
             new PhoneDigit().possibleWords(arr, n);
             System.out.println();
              
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class PhoneDigit
{
    static String key[]={"","","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
    static void possibleWords(int a[], int N)
    {
        String curr="";
        int l=0;
        wordsutil(a,N,l,curr);
    }
    static void wordsutil(int[] a,int N,int index,String curr){
        if(N==index){
            System.out.print(curr+" ");
            return;
        }
        else{
            for(int i=0;i<key[a[index]].length();i++)
            wordsutil(a,N,index+1,curr+key[a[index]].charAt(i));
        }
    }
}


