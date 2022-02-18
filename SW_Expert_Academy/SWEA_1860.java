// 1860. 진기의 최고급 붕어빵

// by SonMinji_220218

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D3_1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			int [] arrive = new int[N];
			for(int idx=0; idx<N; idx++) {
				arrive[idx] = sc.nextInt();
			}
			Arrays.sort(arrive);

			String result = "Possible";
			
			int cnt = 0;
			for(int i=0; i<N; i++) {
				cnt = (arrive[i]/M)*K - i;
				if(cnt <= 0) {
					result="Impossible";
					break;
				}
			}
			System.out.printf("#%d %s\n", tcNum, result);
		}
		
	}
}
