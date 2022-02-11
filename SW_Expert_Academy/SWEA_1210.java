// 1210. [S/W 문제해결 기본] 2일차 - Ladder1

// by SonMinji

import java.util.Scanner;

public class SWEA_D4_1210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int tc=1; tc<=10; tc++) {
			int tcNum = sc.nextInt();
			int[][] ladderArr = new int[100][102];
			
			int startX = -1;
			int endX = -1;
			for(int i=0; i<100; i++) {
				for(int j=1; j<=100; j++) {
					ladderArr[i][j] = sc.nextInt();
					if(ladderArr[i][j] == 2) {
						endX = j;
					}
				}
			}
			
			// 현재 위치
			int positionI = ladderArr.length-1;
			int positionJ = endX;
			
			
			// 마지막 행에서는 무조건 위로 가니까 제외
			for(int i=positionI-1; i>=0; i--) {
				if(ladderArr[i][positionJ-1] == 1) {
					positionI = i;
					positionJ = positionJ-1;
					break;
				}
				if(ladderArr[i][positionJ+1] == 1) {
					positionI = i;
					positionJ = positionJ+1;
					break;
				}
			}
			
			// 방향 결정 시 사용될 변수
			String directionJ = positionJ<endX ? "-" : "+";
			for(int i=positionI; i>=0; i--) {
				int gostopJ = -1;
				do {
					if(ladderArr[i][positionJ-1] == 1  || ladderArr[i][positionJ+1] == 1) {
						
						// if : 양쪽 다 1인 경우     else if, else : 한쪽만 1인 경우
						if(ladderArr[i][positionJ-1] == ladderArr[i][positionJ+1]) {
							
							if(directionJ.equals("-")) {
								positionJ = positionJ-1;
							} else {
								positionJ = positionJ+1;
							}
							
						} else if(ladderArr[i][positionJ-1] == 1) {
							positionJ = positionJ-1;
							directionJ = "-";
						} else {
							positionJ = positionJ+1;
							directionJ = "+";
						}
						gostopJ = directionJ.equals("-") ? positionJ-1 : positionJ+1;
					}
					
				} while(gostopJ != -1 && ladderArr[i][gostopJ] == 1); // 조건식이 false일 경우 while문 종료
			}
			
			// 맨위에서 102열로 만들어서 위치에서 -1
			startX = positionJ - 1;
			System.out.printf("#%d %d\n", tcNum, startX);
		}
	}
}
