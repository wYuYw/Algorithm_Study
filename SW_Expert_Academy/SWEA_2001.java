// 2001. 파리 퇴치

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D2_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int M = sc.nextInt();
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			int maxKill = 0;
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					int killCnt = 0;
					for(int mi=0; mi<M; mi++) {
						for(int mj=0; mj<M; mj++) {
							killCnt += arr[i+mi][j+mj];
						}
					}
					maxKill = Math.max(maxKill, killCnt);
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, maxKill);
		}
	}
}
