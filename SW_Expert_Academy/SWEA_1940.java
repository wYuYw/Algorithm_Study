// 1940. 가랏! RC카!

// by SonMinji_220210

import java.util.Scanner;

public class SWEA_D2_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int v = 0;
			int d = 0;
			for(int cmdNum=1; cmdNum<=N; cmdNum++) {
				int cmd = sc.nextInt();
				if(cmd != 0) {
					int a = sc.nextInt();
					if(cmd == 2) {
						v = v-a < 0 ? 0 : v-a;
					} else {
						v = v+a;
					}
				}
				d += v;
			}
			System.out.printf("#%d %d\n", tcNum, d);
		}
		
	}
}
