// 1249. [S/W 문제해결 응용] 4일차 - 보급로

// by SonMinji_220413

package SWEA_Level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D4_1249 {
	
	static class Pos {
		int r;
		int c;
		
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			// 지도 크기 (N <= 100)
			int N = sc.nextInt();
			// 지도 정보 저장할 배열
			int[][] map = new int[N][N];
			// 복구 시간 계산하여 저장할 배열
			int[][] hour = new int[N][N];
			// 지도 정보 입력
			for(int r=0; r<N; r++) {
				String str = sc.next();
				for(int c=0; c<N; c++) {
					// 문자열로 입력된 수를 배열에 넣을 때
					// int배열인지 char배열인지 잘 파악하여 숫자가 제대로 들어갈 수 있게 처리하기 ★
					map[r][c] = str.charAt(c)-'0';
				}
				// 가장 짧은 복구 시간을 파악하여 배열에 저장해야하므로
				// 큰 값으로 배열을 초기화해줌
				Arrays.fill(hour[r], Integer.MAX_VALUE);
			}
			
      
			Queue<Pos> q = new LinkedList<>();
			
			// 현 좌표에서 4방향 탐색  상 우 하 좌
			int[] dr = {-1, 0, 1, 0};
			int[] dc = {0, 1, 0, -1};
			
      // (0, 0)부터 (N-1, N-1)까지 가야 함
			// 시작점 큐에 넣기
			q.add(new Pos(0, 0));
			// 시작점부터 해당 좌표까지의 최소 복구 시간을 배열에 입력
			hour[0][0] = 0;
      
			while(!q.isEmpty()) {
				Pos curr = q.poll();
				
				for(int d=0; d<4; d++) {
					int moveR = curr.r+dr[d];
					int moveC = curr.c+dc[d];
					
					if(moveR < 0 || moveR >= N || moveC <0 || moveC >= N) {
						continue;
					} else {
						if(hour[moveR][moveC] > hour[curr.r][curr.c]+map[moveR][moveC]) {
							q.add(new Pos(moveR, moveC));
							hour[moveR][moveC] = hour[curr.r][curr.c]+map[moveR][moveC];
						}
					}
				}
			}
			
			// 결과 출력
			System.out.printf("#%d %d\n", tcNum, hour[N-1][N-1]);
		}
	}
}
