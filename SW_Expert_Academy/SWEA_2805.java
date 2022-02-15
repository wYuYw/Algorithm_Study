// 2805. 농작물 수확하기

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D3_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();

			int sum = 0;
			int startIdx = N/2;
			int endIdx = N/2;
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int idx=startIdx; idx<=endIdx; idx++) {
					sum += (str.charAt(idx)-'0');
				}
				if(i < N/2) {
					startIdx--;
					endIdx++;
				} else {
					startIdx++;
					endIdx--;
				}
			}
      
			System.out.printf("#%d %d\n", tcNum, sum);
		}
	}
}
