package searching;

//https://leetcode.com/problems/koko-eating-bananas/
class KoKoEatingBanana {
	public int minEatingSpeed(int[] piles, int h) {

		int max = findMax(piles);

		int k = max;
		int l = 1;
		int r = k;

		while (l < r) {
			int m = l + (r - l) / 2;
			if (canEatAll(piles, m, h)) {
				r = m;
			} else
				l = m + 1;
		}

		return l;
	}

	public int findMax(int[] piles) {
		int max = 1;

		for (int i = 0; i < piles.length; i++) {
			max = Math.max(max, piles[i]);
		}
		return max;
	}

	public boolean canEatAll(int[] piles, int k, int h) {
		int countH = 0;
		for (int i = 0; i < piles.length; i++) {

			int temp = piles[i];
			countH = countH + temp / k;
			if (temp % k != 0)
				countH++;

			if (countH > h)
				return false;
		}
		return true;
	}
}