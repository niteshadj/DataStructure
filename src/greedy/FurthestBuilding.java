package greedy;

import java.util.PriorityQueue;

public class FurthestBuilding {

	public static void main(String[] args) {

		int[] heights = { 4, 2, 7, 6, 9, 14, 12 };
		int bricks = 5;
		int ladders = 1;
		System.out.println(furthestBuilding(heights, bricks, ladders));

	}

	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (int i = 1; i < heights.length; i++) {
			if (heights[i] - heights[i - 1] > 0) {
				minHeap.add(heights[i] - heights[i - 1]);
				if (minHeap.size() == ladders + 1) {
					bricks = bricks - minHeap.poll();
					if (bricks < 0)
						return i - 1;
				}
			}

		}

		return heights.length - 1;

	}

}
