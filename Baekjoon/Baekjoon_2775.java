// 2775. 부녀회장이 될테야

// by SonMinji_220624

import java.util.Scanner;

public class BJ2775 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// 0층~14층 1~14호에 사는 사람 수 저장할 배열
		int[][] map = new int[15][14];
		// 0층 거주민 수 저장. j호에 j명 
		for(int j=0; j<14; j++) {
			map[0][j] = j+1;
		}
		// k층 n호에 k-1층 1~n호 거주민 수 합만큼 거주하게 되므로
		// 각 층의 1호에는 1명 거주 (0층 1호에 1명 거주하니까 층수가 높아져도 1호에 거주하는 사람 수는 1로 동일)
		for(int i=0; i<15; i++) {
			map[i][0] = 1;
		}
		// k층 n호에 거주하는 사람 수 계산하여 저장
		for(int r=1; r<15; r++) {
			for(int c=1; c<14; c++) {
				// k층 n호에 k-1층 1~n호 거주민 수 합만큼 거주하게 되는데
				// k층 n-1호에 k-1층 1~(n-1)호 거주민 수 합만큼 거주하므로
				// k층 n호에는 k층 n-1호 거주민 수와 k-1층 n호 거주민 수 합만큼 거주하게 됨
				map[r][c] = map[r][c-1] + map[r-1][c];
			}
		}
		
		// 층 수, 호 수 (1 <= k, n <= 14)
		int k, n;
		// 테스크 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) { // 각 테스트 케이스마다
			// 층 수 입력
			k = sc.nextInt();
			// 호 수 입력
			n = sc.nextInt();
			
			// 결과 출력
			// 배열의 인덱스가 0부터 시작이라 입력받은 호 수-1에 위치한 값이 구하려는 값임
			System.out.println(map[k][n-1]);
		}
	}
}
