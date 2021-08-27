package string;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ProperlyCompressStrings {

	public static void main(String[] args) {
		int [] px= {2,3,10,2,4,8,1};
		System.out.println(maxDifference(px));
	}

	private static String betterCompression(String s) {
		if (s.length() < 2)
			return s;
		StringBuilder response=new StringBuilder();
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < s.length() - 1;) {
			Character c = new Character(s.charAt(i));
			String temp="";
			i++;
			while(i<s.length() && !(s.charAt(i)>='a' && s.charAt(i)<='z')  ) {
				temp=temp+s.charAt(i);
				i++;
			}
			int freq = Integer.parseInt(temp);
			int currFreq = map.getOrDefault(c, 0);
			map.put(c, currFreq + freq);
		}
		
		for(Entry e: map.entrySet()) {
			response.append(e.getKey()).append(e.getValue());
		}
		
		return response.toString();
	}
	
	private static int maxDifference(int[] px) {
		int length=px.length;
		int min = px[0];
		int maxDiff = 0;
		for (int i = 1; i < length; i++) {
			maxDiff = Math.max(maxDiff, px[i] - min);
			if (min > px[i]) {
				min = px[i];
			}

		}
		if(maxDiff==0)
			return -1;
		return maxDiff;
	}

}
