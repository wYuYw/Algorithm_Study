// 1074. Z - 재귀 이용 

// by SonMinji_220416

import java.util.Scanner;

public class BJ1074 {
	
	static int R, C;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열 크기 2^N (1 <= N <= 15)
		int N = sc.nextInt();
		int n = (int) Math.pow(2, N);
		// 몇 번째로 방문하는지 알아낼 행 (0 <= R < 2^N)
		R = sc.nextInt();
		// 몇 번째로 방문하는지 알아낼 열 (0 <= C < 2^N)
		C = sc.nextInt();
		
		// 몇 번째로 해당 칸 방문하는지 카운트
		cnt = 0;
		// Z모양으로 움직이는 재귀
		Z(n, 0, 0);
	}
	
	// Z모양으로 움직이는 재귀
	public static void Z(int n, int r, int c) {
		// base case
		if(r == R && c == C) {
			// 결과 출력
			System.out.println(cnt);
			return;
		}

		// Z 모양으로 움직이는 단위
		int move = n/2;
		// Z의 한 범위(꼭짓점)에 있는 칸 개수
		int mCnt = move*move;
		// 찾는 좌표가 해당 범위 안에 없으면 숫자 한번에 더하고 재귀 넘어가기
		if(R < r+move) {
			if(C < c+move) {
				// Z 시작점
				Z(move, r, c);
			} else {
				cnt += mCnt;
				// Z 두번째 점 (시작점에서 오른쪽)
				Z(move, r, c+move);
			}
		} else {
			cnt += mCnt * 2;
			if(C < c+move) {
				// Z 세번째 점 (시작점에서 아래)
				Z(move, r+move, c);
			} else {
				cnt += mCnt;
				// Z 네번째 점 (시작점에서 오른쪽 아래)
				Z(move, r+move, c+move);
			}
		}
	}
	
}
