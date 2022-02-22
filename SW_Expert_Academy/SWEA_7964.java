// 7964. 부먹왕국의 차원 관문

// by SonMinji_220222

import java.util.Scanner;

public class SWEA_D3_7964re {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			
			int zeroCnt = 0;
			int cnt = 0;
			for(int i=0; i<N; i++) {
				if(sc.nextInt() == 0) {
					zeroCnt++;
					if(zeroCnt == D) {
						cnt++;
						zeroCnt = 0;
					}
				} else {
					zeroCnt = 0;
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
}
