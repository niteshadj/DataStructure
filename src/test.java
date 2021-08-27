import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		test t = new test();
		String[] words = { "a", "bb", "acd", "ace" };
		System.out.println(t.numMatchingSubseq("abcde", words));

	}

	public int numMatchingSubseq(String s, String[] words) {
		int j = s.length();
		int count = 0;
		HashSet<String> mySet = new HashSet();
		findAllSubSequences(mySet, "", s, s.length(), 0);
		System.out.println(mySet);
		for (int i = 0; i < words.length; i++) {
			if (mySet.contains(words[i])) {
				count++;

			}

		}

		return count;
	}

	private void findAllSubSequences(HashSet<String> mySet, String temp, String s, int length, int i) {

		if (i == length) {
			if (temp != s && temp!="")
				mySet.add(temp);
			return;
		}

		findAllSubSequences(mySet, temp + s.charAt(i), s, length, i + 1);
		findAllSubSequences(mySet, temp, s, length, i + 1);

	}

}
