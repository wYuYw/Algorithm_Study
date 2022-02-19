// 11586. 지영 공주님의 마법 거울

// by SonMinji_220122

import java.util.Scanner;

public class BJ11586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 어차피 한 칸에 문자 하나만 들어오니까 char로 만드는 게 더 나은 방법 같음
		String[][] arr = new String[n][n];
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<n; j++) {
				// 이것도 charAt(j) 이용하는 게 더 나은 방법 같다
				arr[i][j] = str.substring(j,j+1);
			}
		}
		int k = sc.nextInt();
		
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				if(k==1) {
					System.out.print(arr[r][c]);
				} else if(k==2) {
					System.out.print(arr[r][n-1-c]);
				} else if(k==3) {
					System.out.print(arr[n-1-r][c]);
				}
			}
			System.out.println();
		}
	}
}
