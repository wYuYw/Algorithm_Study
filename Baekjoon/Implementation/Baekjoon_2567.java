// Baekjoon_2567 색종이 - 2

// Solution by wYuYw

import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// initialize; place papers on the matrix
		int[][] matrix = new int[101][101];
		int n = sc.nextInt(); // number of papers
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt(), r = sc.nextInt();
			for(int row = 0; row < 10; row++) {
				for(int col = 0; col < 10; col++) matrix[r+row][c+col] = 1;
			}
		}
		
		// find result
		int result = 0;
		// right, down, left, up
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
		for(int i = 0; i <100; i++) {
			for(int j = 0; j <100; j++) {
				if(matrix[i][j] == 1) {
					for(int k = 0; k < 4; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						if(matrix[nr][nc] == 0 || nr < 0 || nr > 100 || nc < 0 || nc > 100) {
							result += 1;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
