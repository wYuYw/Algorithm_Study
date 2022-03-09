// Baekjoon_2567 색종이 - 2

// by SonMinji_220309

import java.util.Scanner;

public class BJ2567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[102][102];
		for(int i=0; i<N; i++) {
			int cNum = sc.nextInt()+1;
			int rNum = sc.nextInt()+1;
			for(int r=rNum; r<rNum+10; r++) {
				for(int c=cNum; c<cNum+10; c++) {
					map[r][c] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i=1; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(map[i][j] != map[i][j+1]) {
					result++;
				}
			}
		}
		for(int j=1; j<101; j++) {
			for(int i=0; i<101; i++) {
				if(map[i][j] != map[i+1][j]) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
