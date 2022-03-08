// Baekjoon_1592 영식이와 친구들

// by SonMinji_220308

import java.util.Scanner;

public class BJ1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] ballCnt = new int[N];
		ballCnt[0]++;
		int i = N;
		
		while (ballCnt[0] != M) {
			int idx = i % N;
			if(ballCnt[idx] % 2 == 1) {
				i = i+L;
				idx = i % N;
			} else {
				if( i-L < 0) {
					i = N-(L-i);
				} else {
					i = i-L;					
				}
				idx = i % N;
			}
			ballCnt[idx]++;
			if(ballCnt[idx] == M) {
				break;
			}
		}

		int result = 0;
		for(int idx=0; idx<N; idx++) {
			result += ballCnt[idx];
		}
		System.out.println(result-1);
	}
}
