package greedy;

import java.util.Stack;

public class ShortestUnsortedContiguousSubarr {

	public static void main(String[] args) {
		ShortestUnsortedContiguousSubarr contiguousSubarr = new ShortestUnsortedContiguousSubarr();
		int[] nums = { 1, 2, 3, 5, 4 };
		System.out.println(contiguousSubarr.findUnsortedSubarray(nums));
	}

	public int findUnsortedSubarray(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return 0;

		Stack<Integer> stack = new Stack<>();
		int l = Integer.MAX_VALUE;
		int r = 0;
		int currMax = nums[0];
		stack.push(0);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < currMax) {
				r = i;
				while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
					stack.pop();
				if (stack.isEmpty())
					l = -1;
				else {
					if (l >= stack.peek()) {
						l = stack.peek();
					}
				}

			} else {
				currMax = nums[i];
			}
			stack.push(i);
		}
		if (l == Integer.MAX_VALUE)
			return 0;
		return (r - l);

	}
	
	public int findUnsortedSubarrayOpti(int[] A) {
	    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
	    for (int i=1;i<n;i++) {
	      max = Math.max(max, A[i]);
	      min = Math.min(min, A[n-1-i]);
	      if (A[i] < max) end = i;
	      if (A[n-1-i] > min) beg = n-1-i; 
	    }
	    return end - beg + 1;
	}

}
