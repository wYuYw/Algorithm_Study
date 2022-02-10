// 1206. [S/W 문제해결 기본] 1일차 - View

// by SonMinji_220209

import java.util.Scanner;

public class SWEA_D3_1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int tcLength = sc.nextInt();
			int[][] tcArr = new int[255][tcLength];
			int tcResult = 0;
			for(int c=0; c<tcLength; c++) {
				int tcVal = sc.nextInt();
				for(int r=0; r<255; r++) {
					if(tcVal>=r+1) {
						tcArr[r][c] = 1;
					}
				}
			}
			
			for(int r=0; r<255; r++) {
				for(int c=0+2; c<tcLength-2; c++) {
					if(tcArr[r][c] > tcArr[r][c-1] && tcArr[r][c] > tcArr[r][c-2] && tcArr[r][c] > tcArr[r][c+1] && tcArr[r][c] > tcArr[r][c+2]) {
						tcResult++;
					}
				}
			}
			System.out.printf("#%d %d\n", tcNum, tcResult);
		}

	}
}
