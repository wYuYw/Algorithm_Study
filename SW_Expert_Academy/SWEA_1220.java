// 1220. [S/W 문제해결 기본] 5일차 - Magnetic

// by SonMinji_220227

import java.util.Scanner;

public class SWEA_D3_1220 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int cnt = 0;
			for(int j=0; j<N; j++) {
				boolean twoCheck = false;
				for(int i=0; i<N; i++) {
					if(twoCheck == false && map[i][j] == 1) {
						twoCheck = true;
					} else if(twoCheck == true && map[i][j] == 2) {
						cnt++;
						twoCheck = false;
					}
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
}
