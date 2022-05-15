// 1018. 체스판 다시 칠하기

// by SonMinji_220515

import java.util.Scanner;

public class BJ1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 보드 크기 NxM (8 <= N, M <= 50)
		int N = sc.nextInt();
		int M = sc.nextInt();
		// 보드의 각 칸에 칠해져 있는 색 정보 배열
		char[][] map = new char[N][M];
		// 색 정보 (B or W) 입력
		for(int n=0; n<N; n++) {
			map[n] = sc.next().toCharArray();
		}
		
		// 칠해야 하는 정사각형의 최소 개수
		int minCnt = Integer.MAX_VALUE;
		// 무슨 색인지 체크하는 변수
		char BnW;
		
		// 보드를 8x8 크기만큼 잘라내 왼쪽 상단 첫 칸부터
		// BFS처럼 한계층씩 체크하면서 칠해야 하는 최소 정사각형 개수 찾기
		loop: for(int n=0; n<=N-8; n++) {
			for(int m=0; m<=M-8; m++) {
				// 첫 칸의 색
				BnW = map[n][m] == 'B' ? 'B' : 'W';
				// 색칠해야 하는 칸의 개수
				int cnt = 0;
				// 시작 칸을 반대 색으로 칠할 거라고 가정하면 색칠해야 하는 칸의 개수
				// (꼭 시작칸의 색을 그대로 유지해야하는 게 아니기 때문에)
				int reCnt = 0;
				
				for(int d=0; d<8; d++) { // d : 계층 (시작점에서 떨어진 거리)
					for(int i=0; i<=d; i++) {
						if(d % 2 == 0) { // 첫 칸과 색이 같은 계층
							// 첫 칸의 색을 그대로 사용했을 때
							// 체스판의 시작점(n+0,m+0)에서 d만큼 떨어진 칸 체크
							cnt = map[n+i][m+d-i] == BnW ? cnt : cnt+1 ;
							// 체스판의 끝점(n+7,m+7)에서 d만큼 떨어진 칸 체크
							cnt = map[n+7-i][m+7-(d-i)] == BnW ? cnt : cnt+1 ;
							
							// 첫 칸의 색을 바꿨을 때
							// 체스판의 시작점(n+0,m+0)에서 d만큼 떨어진 칸 체크
							reCnt = map[n+i][m+d-i] != BnW ? reCnt : reCnt+1 ;
							// 체스판의 끝점(n+7,m+7)에서 d만큼 떨어진 칸 체크
							reCnt = map[n+7-i][m+7-(d-i)] != BnW ? reCnt : reCnt+1 ;
						} else { // 첫 칸과 색이 다른 계층
							// 체스판의 시작점(n+0,m+0)에서 d만큼 떨어진 칸 체크
							// 첫 칸의 색을 그대로 사용했을 때
							cnt = map[n+i][m+d-i] != BnW ? cnt : cnt+1 ;
							// 첫 칸의 색을 바꿨을 때
							reCnt = map[n+i][m+d-i] == BnW ? reCnt : reCnt+1 ;
							
							if(d != 7) { //  7계층은 위 코드에서 이미 계산하였으므로 제외
								// 체스판의 끝점(n+7,m+7)에서 d만큼 떨어진 칸 체크
								// 첫 칸의 색을 그대로 사용했을 때
								cnt = map[n+7-i][m+7-(d-i)] != BnW ? cnt : cnt+1 ;
								// 첫 칸의 색을 바꿨을 때
								reCnt = map[n+7-i][m+7-(d-i)] == BnW ? reCnt : reCnt+1 ;
							}
						}
					}
				}
				
				// 칠해야 하는 정사각형 개수 중 최소값을 minCnt에 저장 
				minCnt = Math.min(minCnt, Math.min(cnt, reCnt));
				// minCnt가 0보다 작아질 수 없으므로 0 나오면 칠해야하는 개수 구하는 동작 더이상 할 필요 없음
				if(minCnt == 0) {
					break loop;
				}
			}
		}
		
		// 결과 출력
		System.out.println(minCnt);
	}
}
