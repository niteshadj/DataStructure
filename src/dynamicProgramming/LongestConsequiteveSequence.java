package dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsequiteveSequence {

	public int longestConsecutive(int[] nums) {

		int n = nums.length;
		if (n == 0)
			return 0;
		int res = Integer.MIN_VALUE;

		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap();

		for (int i = 0; i < n; i++) {
			set.add(nums[i]);
		}

		for (int i = 0; i < n; i++) {
			res = Math.max(res, longestConsequitveEndingWith(nums[i], set, map));
		}

		return res;

	}

	public int longestConsequitveEndingWith(int num, HashSet<Integer> set, HashMap<Integer, Integer> map) {

		if (!set.contains(num))
			return 0;
		if (map.containsKey(num))
			return map.get(num);

		int ans = 1 + longestConsequitveEndingWith(num - 1, set, map);
		map.put(num, ans);

		return ans;

	}

	public int longestConsecutiveOpti(int[] nums) {
		Set<Integer> num_set = new HashSet<Integer>();
		for (int num : nums) {
			num_set.add(num);
		}

		int longestStreak = 0;

		for (int num : num_set) {
			if (!num_set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (num_set.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}

}
