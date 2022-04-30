// 1012. 유기농 배추

// by SonMinji_220430

import java.util.Scanner;

public class BJ1012 {
	
	// 배추밭 가로 세로 길이
	static int M, N;
	// 배추밭 정보 담은 배열
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) { // 각 테스트 케이스마다
			// 배추밭 가로 길이 (1 <= M <= 50)
			M = sc.nextInt();
			// 배추밭 세로 길이 (1 <= N <= 50)
			N = sc.nextInt();
			// 배추밭 배열
			map = new int[N][M];
			// 배추가 심어져 있는 위치 개수 (1 <= K <= 2500)
			int K = sc.nextInt();
			// 배추밭에 배추 위치 표시
			for(int k=1; k<=K; k++) {
				// 0 <= X <= M-1
				int X = sc.nextInt();
				// 0 <= Y <= N-1
				int Y = sc.nextInt();
				// 해당 위치에 배추 있다고 1로 표시
				map[Y][X] = 1;
			}
			
			// 필요한 배추흰지렁이의 마리 수 
			int cnt = 0;
			// 배추밭 배열을 행우선순회하면서 몇 마리 필요한지 체크
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(map[y][x] == 1) {
						// 배추밭에 배추가 있으면 지렁이 한마리 필요함
						cnt++;
						// 해당 배추와 인접한 배추는 위에서 추가해준 지렁이 한마리로 커버 가능하므로
						// 지렁이 배치한 배추로 표시해주기
						check(y, x);
					}
				}
			}
			
			// 결과 출력
			System.out.println(cnt);
		}
	}
	
	// 체크한 배추와 인접한 배추들 하나로 묶기
	// 상하좌우 네 방향에 배추가 위치하면 배추 무리로 묶어 지렁이 한마리로 커버 가능
	public static void check(int y, int x) {
		// base case
		// 배추밭 범위를 벗어나는 경우
		if(y < 0 || y >= N || x < 0 || x >= M) {
			return;
		}
		// 배추밭의 해당 위치에 배추가 없는 경우
		if(map[y][x] == 0) {
			return;
		}
		
		// 배추밭의 해당 위치에 배추가 있는 경우
		// 메서드 실행하기 전 이중 for문에서 지렁이 수를 추가해줬으므로
		// 해당 배추 무리는 값을 0으로 바꿔 지렁이 수가 추가되지 않도록 함
		map[y][x] = 0;
		// recursive case
		// 상
		check(y-1, x);
		// 하
		check(y+1, x);
		// 좌
		check(y, x-1);
		// 우
		check(y, x+1);
	}
	
}
