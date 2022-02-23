// 1285. 아름이의 돌 던지기

// by SonMinji_220223

import java.util.Scanner;

public class SWEA_D2_1285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
    
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[] D = new int[N];
			for(int i=0; i<N; i++) {
				D[i] = Math.abs(0-sc.nextInt());
			}
      
			int min = D[0];
			// min 값에 해당 하는 돌의 개수가 일단 나 하나 무조건 있으니까 1로 초기화
			int cnt = 1;
			for(int i=1; i<N; i++) {
				if(D[i] < min) { // min 값이 바뀔 경우
					min = D[i];
					cnt = 1; // cnt도 다시 1로 초기화
				} else if(D[i] == min){ // min 값이랑 같아서 min 값이 그대로 일 경우 
					cnt++; // cnt 하나 증가
				} else { // min 값이 그대로 일 경우 
					// cnt 값 유지
				}
			}
			
			System.out.printf("#%d %d %d\n", tcNum, min, cnt);
		}
	}
}
