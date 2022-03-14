// Baekjoon_17070. 파이프 옮기기 1

// by SonMinji_220314

import java.util.Scanner;

public class BJ17070 {
	static int cnt = 0;
	static int N;
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dfs(0, 1, 0);
		System.out.println(cnt);
	}

	static void dfs(int r, int c, int d) {
		if(r == N-1 && c == N-1) {
			cnt++;
			return;
		}
		
		if (r < N - 1 && c < N - 1 && map[r][c + 1] == 0 && map[r + 1][c] == 0 && map[r + 1][c + 1] == 0)
			dfs(r + 1, c + 1, 2);        
		if(d == 0 || d == 2) {
			if (c < N - 1 && map[r][c+1] == 0)
				dfs(r, c + 1, 0);
		}
		if(d == 1 || d == 2) {
			if (r < N - 1  && map[r+1][c] == 0)
				dfs(r + 1, c, 1);
		}
		
	}
	
}
