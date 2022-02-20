// SWEA_1961 숫자 배열 회전

// Solution by wYuYw

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// initialize
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) matrix[r][c] = sc.nextInt();
			}
			
			// rotate 90, 180, 270
			int[][] matrix90 = rotate(matrix, n);
			int[][] matrix180 = rotate(matrix90, n);
			int[][] matrix270 = rotate(matrix180, n);
			
            System.out.println("#" + tc);
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) System.out.print(matrix90[r][c]);
				System.out.print(" ");
				for(int c = 0; c < n; c++) System.out.print(matrix180[r][c]);
				System.out.print(" ");
				for(int c = 0; c < n; c++) System.out.print(matrix270[r][c]);
				System.out.println();
			}
		}
	}
	
	// rotation function
	private static int[][] rotate(int[][] matrix, int n) {
		int[][] result = new int[n][n];
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) result[r][c] = matrix[n-1-c][r];
		}
		return result;
	}
}
