package hashing;

import java.util.TreeMap;

//https://leetcode.com/problems/my-calendar-i/
class MyCalendar {
    TreeMap<Integer, Integer> books = new TreeMap<>();

    public boolean book(int s, int e) {
        java.util.Map.Entry<Integer, Integer> floor = books.floorEntry(s), ceiling = books.ceilingEntry(s);
        if (floor != null && s < floor.getValue()) return false; // (s, e) start within floor
        if (ceiling != null && ceiling.getKey() < e) return false; // ceiling start within (s, e)
        books.put(s, e);
        return true;
    }
}


/*
 * TreeMap<Integer, Integer> map; public MyCalendar() { map = new TreeMap<>(); }
 * 
 * public boolean book(int start, int end) { Integer low = map.lowerKey(end);
 * 
 * if(low == null || map.get(low) <= start) { map.put(start, end); return true;
 * } return false; }
 */