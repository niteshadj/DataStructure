package math;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinDiffBwLasrgestSmallestValues {

	
	public int minDifference(int[] nums) {
		Arrays.sort(nums);
		int res=Integer.MAX_VALUE;
		if(nums.length<5)
			return 0;
		for(int i=0;i<4;i++) {
			res=Math.min(res, nums[nums.length-4+i]-nums[i]);
		}
		
		return res;
    }
	
	public int minDifferenceOpti(int[] nums) {
        int len = nums.length;
        if(len<5){
            return 0;
        }
        PriorityQueue<Integer> max = new  PriorityQueue<Integer>();
        PriorityQueue<Integer> min = new  PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i= 0; i<len; i++){
            max.add(nums[i]);
            min.add(nums[i]);
            
            if(max.size()>4){
                max.poll();
                min.poll();
            }
        }
        //input : [20, 75 ,81, 82 ,95 ,100, 200 ,300]
        int[] minA = new int[4]; //[82,81,75,20]
        int[] maxA = new int[4]; //[300,200,100,95]
        for(int i=0,k=3; i<4; i++,k--){
            minA[i] = min.poll();
            maxA[k] = max.poll();
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            ans = Math.min(ans, maxA[i] - minA[i]);
        }
        return ans;
    }
}
