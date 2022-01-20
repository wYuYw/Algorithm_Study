// 1504 : 지그재그 배열 2

// by SonMinji
// 1503문제 푼 코드에서 배열에 값(num) 입력할 때 행과 열(i-1와 j-1)만 바꿔줌

import java.util.Scanner;

public class CU1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 1;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				for(int j=1; j<=n; j++) {
					arr[j-1][i-1] = num;
					num++;
				}
			} else {
				for(int j=n; j>=1; j--) {	
					arr[j-1][i-1] = num;
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
