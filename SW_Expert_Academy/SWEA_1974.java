// 1974. 스도쿠 검증

// by SonMinji_220217

import java.util.Scanner;

public class SWEA_D2_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int[][] arr = new int[9][9];
			int sum = 0;
			boolean result = true;
			
			// 값 입력
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 행 검사
			rowcheck : for(int i=0; i<9; i++) {
				int[] checkArr = new int[9];
				for(int j=0; j<9; j++) {
					checkArr[arr[i][j]-1] = 1;
				}
				for(int idx=0; idx<9; idx++) {
					if(checkArr[idx] != 1) {
						result = false;
						break rowcheck;
					}
					
				}
			}
			
			if(result) {
				// 열 검사
				colcheck : for(int j=0; j<9; j++) {
					int[] checkArr = new int[9];
					for(int i=0; i<9; i++) {
						checkArr[arr[i][j]-1] = 1;
					}
					for(int idx=0; idx<9; idx++) {
						if(checkArr[idx] != 1) {
							result = false;
							break colcheck;
						}
					}
				}
			}
			
			if(result) {
				// 3X3 검사
				boxcheck : for(int i=0; i<9; i+=3) {
					for(int j=0; j<9; j+=3) {
						int[] checkArr = new int[9];
						for(int mi=i; mi<i+3; mi++) {
							for(int mj=j; mj<j+3; mj++) {
								checkArr[arr[mi][mj]-1] = 1;
							}
						}
						for(int idx=0; idx<9; idx++) {
							if(checkArr[idx] != 1) {
								result = false;
								break boxcheck;
							}
						}
						
					}
				}
			}
			
			if(result) {
				System.out.printf("#%d %d\n", tcNum, 1);
			} else {
				System.out.printf("#%d %d\n", tcNum, 0);
			}
			
		}
	}
}
