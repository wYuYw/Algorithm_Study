// 9663. N-Queen

// by SonMinji_220406

import java.util.Scanner;

public class BJ9663 {
	// 퀸 개수이자 체스판 크기
	static int N;
	// 체스판 배열
	static int[][] chessboard;
	// 퀸 놓는 방법 수
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 퀸 개수이자 체스판 크기
		N = sc.nextInt();
		// 체스판 배열
		chessboard = new int[N][N];
		
		// NXN 체스판에 N개의 퀸을 서로 공격할 수 없게 놓기
		dropTheQueen(0);
		
		// 결과 출력
		System.out.println(cnt);
	}
	
	// 체스판 위에 퀸 놓는 메서드
	public static void dropTheQueen(int r) {
		// r은 행 인덱스를 의미하는 동시에 체스판에 놓은 퀸의 개수이므로 r이 N이 되면 메서드 종료
		if(r == N) {
			// 여기까지 왔다는 것은 퀸 N개를 체스판에 서로 공격할 수 없게 다 놨다는 거니까 
			// 퀸 놓는 방법 수(cnt)를 하나 증가시킨다
			// 퀸 N개를 체스판에 서로 공격할 수 없게 다 놨다고 볼 수 있는 이유는 
			// 아래 for문 안의 if문에 조건이 check(r,c)니까 퀸 놓을 수 있을 때만
			// 체스판에 퀸을 하나 놓고 dropTheQueen(r+1)을 실행했으므로 r이 N이 되었다는 것은
			// N개의 퀸을 체스판에 놨다는 것이다.
			cnt++;
			return;
		}
		
		// 한 행에는 퀸을 하나만 놓을 수 있으므로 (그래야 서로 공격할 수 없게 놓는 거니까)
		// r은 재귀호출 부를 때 r+1로 넘기는 방식으로 컨트롤하고
		// 한 행에서 어느 열에 퀸 놓을지를 for문을 통해 컨트롤함
		for(int c=0; c<N; c++) {
			// 퀸 놓기 전에 퀸을 놔도 되는 자리인지 check메서드로 확인하고 
			// 놓아도 되는 곳(true)이면 해당 위치에 체스 놓기
			if(check(r, c)) {
				// 체스판의 놔도 되는 자리(r, c)에 퀸 놓기
				chessboard[r][c] = 1;
				// 다음 퀸 체스판에 놓으러 가기
				dropTheQueen(r+1);
				// 위 메서드 끝나고 돌아오면 다음 방법을 검사하기 위해 놓았던 퀸을 회수함
				chessboard[r][c] = 0;
			}
		}
	}
	
	// 주변에 퀸이 있는지 왼쪽위, 위, 오른쪽위 체크 (dr은 무조건 -1이라 안적음)
	static int[] dc = {-1, 0, 1};
	// 퀸을 놔도 되는 자리인지 체크하는 메서드
	public static boolean check(int r, int c) {
		// for문을 이용하여 왼쪽위, 위, 오른쪽위 세 방향에 대해 DFS 느낌으로 퀸이 있는지 확인
		for(int i=0; i<3; i++) {
			int moveR = r;
			int moveC = c;
			while(true) {
				moveR -= 1;
				moveC += dc[i];
				if(moveR<0 || moveC<0 || moveC==N) { 
					// 체스판 끝에 다다를 경우
					// break하고 다음 방향 체크하러 가기
					break;
				}
				if(chessboard[moveR][moveC] == 1) {
					// 주변에 퀸이 있는 경우
					// false를 반환에 해당 위치에 퀸 놓지 못하게 함
					return false;
				}
			}
		}
		return true;
	}
	
}
