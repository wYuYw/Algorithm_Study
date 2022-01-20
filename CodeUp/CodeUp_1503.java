// 1503 : 지그재그 입력(2차원 배열)

// by SonMinji

import java.util.Scanner;

public class CU1503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 1;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				for(int j=1; j<=n; j++) {
					arr[i-1][j-1] = num;
					num++;
				}
			} else {
				for(int j=n; j>=1; j--) {	
					arr[i-1][j-1] = num;
					num++;
				}
			}
		}
    
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
