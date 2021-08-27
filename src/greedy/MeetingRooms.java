package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean minMeetingRooms(int[][] intervals) {
		if (intervals.length < 2)
			return true;
		ArrayList<Interval> meetings = new ArrayList();
		int i = 0;
		for (; i < intervals.length; i++) {
			meetings.add(new Interval(intervals[i][0], intervals[i][1]));
		}
		Collections.sort(meetings);
		i = 0;
		for (i = 1; i < meetings.size(); i++) {
			if (meetings.get(i - 1).endTime > meetings.get(i).startTime)
				return false;
		}

		return true;
	}

	public boolean canAttendMeetingsOpti(int[][] intervals) {
		if (intervals.length < 2)
			return true;
		Arrays.sort(intervals, (int[] a, int[] b) -> {
			return a[0] - b[0];
		});

		int i = 1;
		for (; i < intervals.length; i++) {
			if (intervals[i - 1][1] > intervals[i][0])
				return false;
		}

		return true;

	}

}

class Interval implements Comparable<Interval> {

	int startTime;
	int endTime;

	Interval(int start, int end) {
		this.startTime = start;
		this.endTime = end;
	}

	public int compareTo(Interval i) {
		return this.startTime - i.startTime;
	}

}
