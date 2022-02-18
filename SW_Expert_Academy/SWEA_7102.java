// 7102. 준홍이의 카드놀이

// by SonMinji_220218

import java.util.Scanner;

public class SWEA_D2_7102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[] sumArr = new int[N+M+1];
			for(int n=1; n<=N; n++) {
				for(int m=1; m<=M; m++) {
					sumArr[n+m]++;
				}
			}
            
			int max = 0;
			StringBuilder sb = new StringBuilder();
			for(int i=2; i<N+M+1; i++) {
				max = Math.max(max, sumArr[i]);
			}

			for(int i=2; i<N+M+1; i++) {
				if(sumArr[i] == max) {
					sb.append(" "+i);
				}
			}
			String result = sb.toString();
			System.out.println("#"+tcNum+result);
		}

	}
}
