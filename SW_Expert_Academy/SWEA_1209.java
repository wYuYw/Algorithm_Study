// 1209. [S/W 문제해결 기본] 2일차 - Sum

// by SonMinji_220214

import java.util.Scanner;

public class SWEA_D3_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int tcNum = sc.nextInt();
			int[][] arr = new int[100][100];
			int max = Integer.MIN_VALUE;
			int xsum1 = 0;
			int xsum2 = 0;
			for(int i=0; i<100; i++) {
				int rsum = 0;
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
					rsum += arr[i][j];
					if(i == j) {
						xsum1 += arr[i][j];
					}
					if(i+j == 100-1) {
						xsum2 += arr[i][j];
					}
				}
				max = Math.max(max, rsum);
				max = Math.max(max, xsum1);
				max = Math.max(max, xsum2);
			}
			// 현재 max는 각 행의 합, 각 대각선의 합 중 최대값
			
			for(int j=0; j<100; j++) {
				int csum = 0;
				for(int i=0; i<100; i++) {
					csum += arr[i][j];
				}
				max = Math.max(max, csum);
			}
			
			System.out.printf("#%d %d\n", tcNum, max);
		}
	}
}
