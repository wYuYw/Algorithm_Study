// 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기

// by SonMinji_220210

import java.util.Scanner;

public class SWEA_D2_1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int tcNum = sc.nextInt();
			int[] frequency = new int[101];
			int tcVal = -1;
			for(int cnt=1; cnt<=1000; cnt++) {
				tcVal = sc.nextInt();
				frequency[tcVal]++;
			}
			int maxIdx = 0;
			for(int idx=0; idx<=100; idx++) {
				if(frequency[maxIdx] <= frequency[idx]) {
					maxIdx = idx;
				}
			}
			System.out.printf("#%d %d\n", tcNum, maxIdx);
		}
	}
}
