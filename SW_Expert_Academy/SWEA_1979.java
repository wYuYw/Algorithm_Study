// 1979. 어디에 단어가 들어갈 수 있을까

// by SonMinji_220220

import java.util.Scanner;

public class SWEA_D2_1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] puzzle = new int[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					puzzle[r][c] = sc.nextInt();
				}
			}
			
			int cnt = 0;
			// 행 검사
			for(int r=0; r<N; r++) {
				int sum = 0;
				for(int c=0; c<N; c++) {
					if(puzzle[r][c] == 1) {
						sum++;
					}
					if(puzzle[r][c] == 0 || c == N-1) {
						if(sum == K) {
							cnt++;
						}
						sum = 0;
					}
                }                   
			}
			
			// 열 검사
			for(int c=0; c<N; c++) {
				int sum = 0;
				for(int r=0; r<N; r++) {
					if(puzzle[r][c] == 1) {
						sum++;
					}
					if(puzzle[r][c] == 0 || r == N-1) {
						if(sum == K) {
							cnt++;
						}
						sum = 0;
					}
				}
			}

			System.out.printf("#%d %d\n", tcNum, cnt);
		}
		
	}
}
