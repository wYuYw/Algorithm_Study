// Baekjoon_2563. 색종이

// by SonMinji_220317

import java.util.Scanner;

public class BJ2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[100][100];
		for(int i=0; i<N; i++) {
			int col = sc.nextInt();
			int row = sc.nextInt();
			for(int r=row; r<row+10; r++) {
				for(int c=col; c<col+10; c++) {
					map[r][c] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				 result += map[i][j];
			}
		}
		
		System.out.println(result);
	}
}
