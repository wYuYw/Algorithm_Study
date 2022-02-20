// 1954. 달팽이 숫자

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D2_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			int val = 1;
			int r = 0;
			int c = 0;
			int direction = 0;
			
			while(val <= N*N) {
				if(direction == 0) { // 왼쪽 -> 오른쪽
					if(c == arr.length || arr[r][c] != 0) {
						c--;
						r++;
						direction = 1;
						continue;
					} else {
						arr[r][c] = val;
						c++;
					}
				} else if(direction == 1) { // 위-> 아래
					if(r == arr.length || arr[r][c] != 0) {
						r--;
						c--;
						direction = 2;
						continue;
					} else {
						arr[r][c] = val;
						r++;
					}
				} else if(direction == 2) { // 오른쪽 -> 왼쪽
					if(c == -1 || arr[r][c] != 0) {
						c++;
						r--;
						direction = 3;
						continue;
					} else {
						arr[r][c] = val;
						c--;
					}
				} else if(direction == 3) { // 아래 -> 위
					if(r == -1 || arr[r][c] != 0) {
						r++;
						c++;
						direction = 0;
						continue;
					} else {
						arr[r][c] = val;
						r--;
					}
				}
				val++;
			}
			
			System.out.println("#"+tcNum);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

// Solution by wYuYw

import java.util.Scanner;

class Practice {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// initialize
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			
			// right, down, left, up
			int[] dirRow = {0, 1, 0, -1};
			int[] dirCol = {1, 0, -1, 0};
			int row = 0, col = 0, dir = 0;
			// find result
			for(int num = 1; num <= n*n; num++) {
				matrix[row][col] = num;
				row += dirRow[dir]; col += dirCol[dir];
				// change direction at boundary condition
				if(row < 0 || row >= n || col < 0 || col >= n || matrix[row][col] != 0) {
					row -= dirRow[dir]; col -= dirCol[dir];
					dir = (dir + 1) % 4;
					row += dirRow[dir]; col += dirCol[dir];
				}
			}
			
			// print result
			System.out.println("#" + tc);
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) System.out.print(matrix[r][c] + " ");
				System.out.println();
			}
		}
	}
}
