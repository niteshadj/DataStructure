package greedy;

public class CapacityToShip {

	public static void main(String[] args) {
		CapacityToShip capacityToShip = new CapacityToShip();
		int[] weights = {3,2,2,4,1,4 };
		System.out.println(capacityToShip.shipWithinDaysOpti(weights, 3));

	}

	public int shipWithinDays(int[] weights, int days) {
		int max = findMax(weights);
		int i = 0;
		int ans = max;
		int noOfDays = 1;
		while (i != weights.length) {

			for (; i < weights.length; i++) {

				if (ans >= weights[i]) {
					ans = ans - weights[i];
				} else {

					noOfDays++;
					if (noOfDays > days)
						break;
					ans = max;

					ans = ans - weights[i];

				}

			}
			if (i != weights.length) {
				i = 0;
				noOfDays = 1;
				max = max + 1;
				ans = max;
			}

		}

		return max;
	}

	private int findMax(int[] weights) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < weights.length; i++) {
			if (max < weights[i])
				max = weights[i];
		}
		return max;
	}


	public int shipWithinDaysOpti(int[] weights, int days) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < weights.length; i++) {
			sum += weights[i];
			if (max < weights[i])
				max = weights[i];
		}

		int l = max;
		int r = sum;

		int mid = 0;
		while (l < r) {
			mid = (l + r) / 2;
			if (isValidCapacity(weights, days, mid)) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}

		return l;
	}

	private boolean isValidCapacity(int[] weights, int days, int capacity) {
		int ans = capacity;
		int noOfDays = 1;
		int i = 0;
		for (; i < weights.length; i++) {

			if (ans >= weights[i]) {
				ans = ans - weights[i];
			} else {

				noOfDays++;
				if (noOfDays > days)
					break;
				ans = capacity;

				ans = ans - weights[i];

			}

		}
		if (i != weights.length) {
			return false;
		}
		return true;
	}

}
