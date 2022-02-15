// 1954. 달팽이 숫자

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D2_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			int val = 1;
			int r = 0;
			int c = 0;
			int direction = 0;
			
			while(val <= N*N) {
				if(direction == 0) { // 왼쪽 -> 오른쪽
					if(c == arr.length || arr[r][c] != 0) {
						c--;
						r++;
						direction = 1;
						continue;
					} else {
						arr[r][c] = val;
						c++;
					}
				} else if(direction == 1) { // 위-> 아래
					if(r == arr.length || arr[r][c] != 0) {
						r--;
						c--;
						direction = 2;
						continue;
					} else {
						arr[r][c] = val;
						r++;
					}
				} else if(direction == 2) { // 오른쪽 -> 왼쪽
					if(c == -1 || arr[r][c] != 0) {
						c++;
						r--;
						direction = 3;
						continue;
					} else {
						arr[r][c] = val;
						c--;
					}
				} else if(direction == 3) { // 아래 -> 위
					if(r == -1 || arr[r][c] != 0) {
						r++;
						c++;
						direction = 0;
						continue;
					} else {
						arr[r][c] = val;
						r--;
					}
				}
				val++;
			}
			
			System.out.println("#"+tcNum);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
