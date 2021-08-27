package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MeetingRooms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minMeetingRooms(int[][] intervals) {
		ArrayList<Interval> meetings = new ArrayList();
		PriorityQueue<Interval> finishTimes = new PriorityQueue<>((Interval a, Interval b) -> (a.endTime - b.endTime));
		for (int i = 0; i < intervals.length; i++) {
			meetings.add(new Interval(intervals[i][0], intervals[i][1]));
		}
		Collections.sort(meetings);
		finishTimes.add(meetings.get(0));
		for (int i = 1; i < meetings.size(); i++) {
			Interval interval = finishTimes.poll();
			if (interval.endTime <= meetings.get(i).startTime) {
				interval.endTime = meetings.get(i).endTime;
			} else {
				finishTimes.add(meetings.get(i));
			}
			finishTimes.add(interval);
		}

		return finishTimes.size();
	}

}
