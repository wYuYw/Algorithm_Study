// 6485. 삼성시의 버스 노선

// by SonMinji_220306

import java.util.Scanner;

public class SWEA_D3_6485 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[][] busRoute = new int[N][2];
			for(int n=0; n<N; n++) {
				busRoute[n][0] = sc.nextInt();
				busRoute[n][1] = sc.nextInt();
			}
			
			int P = sc.nextInt();
			int[][] busStop = new int[P][2];
			for(int p=0; p<P; p++) {
				busStop[p][0] = sc.nextInt();
			}
			
			for(int n=0; n<N; n++) {
				for(int i=busRoute[n][0]; i<=busRoute[n][1]; i++) {
					for(int p=0; p<P; p++) {
						if(busStop[p][0] == i) {
							busStop[p][1]++; 
						}
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int p=0; p<P; p++) {
				sb.append(" "+busStop[p][1]);
			}
			String result = sb.toString();
			System.out.printf("#%d%s\n", tcNum, result);
		}
	}
}
