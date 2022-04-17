// 1010. 다리 놓기

// by SonMinji_220417

import java.util.Scanner;

public class BJ1010 {
	
	public static void main(String[] args) {
		// 조합 배열 mCn (m, n < 30)
		int comb[][] = new int[30][30];
		for(int m = 0; m<30; m++) {
			for(int n = 0; n<30; n++) {
				if(m == n || n == 0) { // m개 중 m개 뽑거나 0개 뽑는 경우의 수는 1개
					comb[m][n] = 1;
				} else if(n < m) { 
					// 그 외 m개 중 n개 뽑는 경우의 수 mCn은
					// m-1Cn + m-1Cn-1
					comb[m][n] = comb[m-1][n] + comb[m-1][n-1];
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			// ( 0 < N <= M < 30)
			// 강 서쪽 사이트 개수 N
			int N = sc.nextInt();
			// 강 동쪽 사이트 개수 M
			int M = sc.nextInt();
			// M개 중 N개 골라 강 서쪽과 동쪽을 다리로 연결해야 하는데 
			// 다리끼리는 서로 겹칠 수 없기 때문에 M개 중 N개를 순서 없이 골라서
			// 위에서부터 서쪽 사이트와 동쪽 사이트를 연결하는 다리를 지으면 된다
			// 따라서 mCn을 구하기
			
			// 매 테스트 케이스마다 배열을 만들면 메모리 많이 사용돼서 for문 밖에 조합 배열 생성
			
			// 결과 출력
			System.out.println(comb[M][N]);
		}
	}
}
