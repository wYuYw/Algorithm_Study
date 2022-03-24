// 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱

// by SonMinji_220324

import java.util.Scanner;

public class SWEA_D3_1217 {
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			int tcNum = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			result = 1;
			pow(N, M);
			
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}
	
	public static void pow(int N, int M) {
		if(M == 0) {
			return;
		}
		result *= N;
		pow(N, M-1);
	}
}
