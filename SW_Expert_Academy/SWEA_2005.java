// 2005. 파스칼의 삼각형

// by SonMinji_220225

import java.util.Scanner;

public class SWEA_D2_2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			System.out.println("#"+tcNum);
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					if(j==0 || j==i) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					}
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
