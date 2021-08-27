package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CoinChange {

	
	public int coinChange(int[] coins, int amount) {
        int res=-1;
        Map<Integer,Integer> memo=new HashMap();
        res=coinChangeUtil(coins,amount,memo);
        if(res==9999999)
            return -1;
        
        
         return res;
       
    }
    //instead of map use array of amount+1 size
     public int coinChangeUtil(int[] coins, int amount, Map<Integer, Integer> memo) {
        if(amount==0)
            return 0;
        if(memo.containsKey(amount))
        	return memo.get(amount);
        int n=coins.length;
      
        
        int minCoins=9999999;
        for(int i=0;i<n;i++){
            if(amount>=coins[i]){
                minCoins=Math.min(minCoins,1+coinChangeUtil(coins,amount-coins[i],memo));
            }
        }
        memo.put(amount, minCoins);
        
       return minCoins;
     }
     
     public int coinChangeTabulation(int[] coins, int amount) {
         int dp[]=new int[amount+1];
         Arrays.fill(dp, amount+1);
         dp[0]=0;
         
         for(int i=1;i<=amount;i++) {
        	 for(int j=0;j<coins.length;j++) {
        		 if(i>=coins[j]) {
        			 dp[i]=Math.min(dp[i], 1+dp[i-coins[j]]);
        		 }
        	 }
         }
         
         if(dp[amount]>amount)
        	 return-1;
          return dp[amount];
        
     }
     
     @Test
     public void coinChangeTest() {
    	 int nums[]= {2};
    	 
    	 assertEquals(-1,coinChange(nums, 11));
    	 assertEquals(-1,coinChangeTabulation(nums, 11));
     }
}
