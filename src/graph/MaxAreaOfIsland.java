package graph;

class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {

		int res = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					int area = dfs(i, j, grid);
					res = Math.max(area, res);
				}
			}
		}

		return res;

	}

	public int dfs(int i, int j, int[][] grid) {

		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
			return 0;
		grid[i][j] = 0;
		return 1 + dfs(i - 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid) + dfs(i + 1, j, grid);
	}
}