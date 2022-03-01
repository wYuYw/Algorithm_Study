// 1215. [S/W 문제해결 기본] 3일차 - 회문1

// by SonMinji_220301

import java.util.Scanner;

public class SWEA_D3_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int N = sc.nextInt();
			char[][] map = new char[8][8];
			for(int i=0; i<8; i++) {
				map[i] = sc.next().toCharArray();
			}
            
			int cnt = 0;
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-N; j++) {

					for(int move=0; move<N/2; move++) {
						if(map[i][j+move] != map[i][j+N-1-move]) {
							break;
						}
						if(move == (N/2)-1) {
							cnt++;
						}
					}

					for(int move=0; move<N/2; move++) {
						if(map[j+move][i] != map[j+N-1-move][i]) {
							break;
						}
						if(move == (N/2)-1) {
							cnt++;
						}
					}
					
				}
			}

			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
}
