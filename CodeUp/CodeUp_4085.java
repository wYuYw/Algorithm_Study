// 4085 : 농사짓기 가장 좋은 땅 고르기

// by SonMinji

import java.util.Scanner;

public class CU4085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		
		int maxSum = 0;
		for(int r=0; r<=n-y; r++) {
			for(int c=0; c<=m-x; c++) {
				int sum=0;
				for(int rr=r; rr<r+y; rr++) {
					for(int cc=c; cc<c+x; cc++) {
						sum += arr[rr][cc];
					}
				}
				maxSum = maxSum>sum ? maxSum : sum;
			}
		}
		System.out.println(maxSum);
	}
}
