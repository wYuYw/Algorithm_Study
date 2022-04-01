// 1226. [S/W 문제해결 기본] 7일차 - 미로1

// by SonMinji_220401

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D4_1226 {
	static int[][] map;
	static int result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int tcNum = sc.nextInt();
			
			// 미로 정보 저장할 배열
			// 입력 받을 미로보다 2씩 크게 만들어서 
			// 크게 만든 부분을 벽인 1로 세팅하여 인덱스 에러 날 수 있는 상황 없게 함
			map = new int[16+2][16+2];
			// 입력 받을 미로를 둘러싸고 있는 패딩부분이 벽인 1로 세팅될 수 있게
			// 이차원 배열의 모든 값을 1로 초기화하고 미로 입력받기
			for(int i=0; i<map.length; i++) {
				// fill 메서드 사용법 제대로 알기
				// 1차원 배열과 2차원 배열 채우는 특정 값으로 초기화하는 법
				// 참고 : https://tosuccess.tistory.com/142
				// 참고 : https://lemonlemon.tistory.com/37
				Arrays.fill(map[i], 1);
				//System.out.println(Arrays.toString(map[i]));
			}
			// 미로 시작점 저장할 변수
			int startR = -1;
			int startC = -1;
			// 미로 정보 입력
			for(int i=1; i<=16; i++) { 
				String row = sc.next();
				for(int j=1; j<=16; j++) {
					// 숫자가 연달아 들어와서 String으로 받고 그걸 charAt으로 잘라서 배열에 넣음
					// int 배열로 만들어서 문자에서 -'0'해줘서 숫자가 제대로 들어가게 함
					map[i][j] = row.charAt(j-1)-'0';
					if(map[i][j] == 2) { // 2: 시작점
						// 시작점 좌표 저장
						startR = i;
						startC = j;
					}
				}
			}
			
			// 도착 못한다(0)고 가정하고 초기화
			result = 0;
			// startR, startC부터 미로 찾아가기
			search3(startR, startC);
			
			// 결과 출력
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}
	
	// 도착점인 3 찾아갈 메서드
	public static void search3(int row, int col) {
		if(result == 1) { // 3을 찾았으면 더이상 미로 찾기 안해도 됨
			return;
		} else if(map[row][col] == 1) { // 벽이면 아동 못 함
			return;
		} else if(map[row][col] == 3) { // 3을 찾으면 result를 1(도착 한다)로 바꾸고 종료
			result = 1;
			return;
		} else { // 그 외 경우 즉, 0(통로)인 경우
			map[row][col] = 1;
			// 상 체크
			search3(row-1, col);
			// 우 체크
			search3(row, col+1);
			// 하 체크
			search3(row+1, col);
			// 좌 체크
			search3(row, col-1);
		}
	}
}
