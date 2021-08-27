package dynamicProgramming;

import org.junit.jupiter.api.Test;

//https://leetcode.com/problems/maximal-square/
public class CountSquareSubMatrixWithAllOnes {

	public int countSquares(int[][] matrix) {
		int sum = 0;
		int[][] mat = new int[matrix.length + 1][matrix[0].length + 1];

		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				if (matrix[i - 1][j - 1] == 1) {
					mat[i][j] = 1 + Math.min(Math.min(mat[i - 1][j - 1], mat[i][j - 1]), mat[i - 1][j]);
					sum += mat[i][j];
				}
			}
		}

		return sum;
	}

}
