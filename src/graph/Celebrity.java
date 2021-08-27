package graph;

public class Celebrity {

	public static void main(String[] args) {
		Celebrity celebrity = new Celebrity();
		System.out.println(celebrity.findCelebrity(3));

	}

	public int findCelebrity(int n) {
		int[] indegree = new int[n];
		int[] outdegree = new int[n];
		int[][] matrix = fillMatrix(n, indegree, outdegree);

		for (int i = 0; i < n; i++) {
			if (indegree[i] == n-1 && outdegree[i] == 0)
				return i;
		}

		return -1;
	}

	private int[][] fillMatrix(int n, int[] indegree, int[] outdegree) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (knows(i, j)) {
					matrix[i][j] = 1;
					if (i != j) {
						indegree[j]++;
						outdegree[i]++;
					}
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

	boolean knows(int a, int b) {
		int[][] matrix = { { 1,  0,1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		if (matrix[a][b] == 1)
			return true;
		else
			return false;
	}
	
	public int findCelebrityOptimized(int n) {
        int candidate = 0;
        for(int i = 1; i < n; i++){
            if(knows(candidate, i))
                candidate = i;
        }
        for(int i = 0; i < n; i++){
            if(i != candidate && (knows(candidate, i) || !knows(i, candidate))) return -1;
        }
        return candidate;
    }

}
