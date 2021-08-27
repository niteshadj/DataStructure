package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/time-based-key-value-store/

class TimeMap {

	/** Initialize your data structure here. */
	Map<String, TreeMap<Integer, String>> map;

	Map<String, List<Data>> tMap;

	public TimeMap() {
		map = new HashMap();
		tMap = new HashMap();
	}

	public void set(String key, String value, int timestamp) {

		map.computeIfAbsent(key, k -> new TreeMap()).put(timestamp, value);
	}

	public String get(String key, int timestamp) {
		if (!map.containsKey(key))
			return "";

		Map.Entry<Integer, String> entry = map.get(key).floorEntry(timestamp);
		if (entry == null)
			return "";
		return entry.getValue();
	}

	// O(1)
	public void setOpti(String key, String value, int timestamp) {
		tMap.computeIfAbsent(key, k -> new ArrayList<Data>()).add(new Data(timestamp, value));

	}

	public String getOpti(String key, int timestamp) {
		if (!tMap.containsKey(key))
			return "";

		List<Data> list = tMap.get(key);

		return findFloor(list, timestamp);

	}

	private String findFloor(List<Data> list, int timestamp) {
		String res = "";

		int r = list.size() - 1;
		int l = 0;
		if (list.get(l).timestamp > timestamp)
			return res;

		while (l < r-1) {
			int m = l + (r - l) / 2;
			int mTime = list.get(m).timestamp;
			if (mTime == timestamp)
				return list.get(m).value;
			if (mTime > timestamp)
				r = m - 1;
			else
				l = m;
		}

		return list.get(r).timestamp > timestamp ? list.get(l).value : list.get(r).value;

	}
}

class Data {
	int timestamp;
	String value;

	Data(int timestamp, String val) {
		this.timestamp = timestamp;
		this.value = val;
	}
}

/**
 * Your TimeMap object will be instantiated and called as such: TimeMap obj =
 * new TimeMap(); obj.set(key,value,timestamp); String param_2 =
 * obj.get(key,timestamp);
 */