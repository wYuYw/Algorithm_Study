// Baekjoon_10163 색종이

// Solution by wYuYw

import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of papers
		int[][] matrix = new int[1001][1001];
		for(int k = 1; k <= n; k++) {
			int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
			y = 1000 - y;
			for(int r = y - h + 1; r <= y; r++) {
				for(int c = x; c < w + x; c++) {
					matrix[r][c] = k;
				}
			}
		}
		int cnt = 0;
		for(int k = 1; k <= n; k++) {
			for(int r = 0; r < 1001; r++) {
				for(int c = 0; c < 1001; c++) {
					if(matrix[r][c] == k) {
						cnt += 1;
					}
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
	}
}
