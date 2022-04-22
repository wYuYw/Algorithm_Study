// 2630. 색종이 만들기

// by SonMinji_220422

import java.util.Scanner;

public class BJ2630 {
	
	// 색 정보 갖고 있는 전체 종이 배열
	static int[][] map;
	// 하얀색 색종이 개수
	static int whiteCnt;
	// 파란색 색종이 개수
	static int blueCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 전체 종이의 한 변의 길이 (N=2^k, k는 1 이상 7 이하의 자연수)
		int N = sc.nextInt();
		// 전체 종이에 칠해진 색 정보 담은 배열 (0: 하얀색, 1: 파란색)
		map = new int[N][N];
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				// 각 칸마다 색 정보 입력
				map[r][c] = sc.nextInt();
			}
		}
		
		// 입력 받은 전체 종이의 색을 확인하며 색상별 개수 세기
		count(0, 0, N);
		
		// 결과 출력
		// 하얀색 색종이 개수
		System.out.println(whiteCnt);
		// 파란색 색종이 개수
		System.out.println(blueCnt);
	}
	
	// 한가지 색의 색종이 개수 세기
	public static void count(int R, int C, int N) {
		// base case
		// 확인해야 하는 종이의 칸이 1칸(N == 1)이면 당연히 한가지 색이고
		// check() 반환값이 true면 한가지 색상이라는 거니까
		// 이 두 가지 경우 중 하나라도 true면 해당 색의 색종이 개수를 하나 늘려주고 메서드 종료
		if(N == 1 || check(R, C, N)) { // 한가지 색상의 색종이인 경우
			if(map[R][C] == 0) { // 그 색이 흰 색인 경우
				// 흰 색 색종이 개수 + 1
				whiteCnt++;
			} else { // 그 색이 파란 색인 경우
				// 파란 색 색종이 개수 + 1
				blueCnt++;
			}
			// 더이상 색종이를 나눠서 체크해볼 필요 없으므로 메서드 종료
			return;
		}
		
		// recursive case
		// 한가지 색이 아닌 경우 종이를 4등분하여 
		// 다시 한가지 색인지 검사하도록 재귀 함수 호출
		count(R, C, N/2);
		count(R, C+N/2, N/2);
		count(R+N/2, C, N/2);
		count(R+N/2, C+N/2, N/2);
		
	}
	
	// 한가지 색의 색종이인지 체크하기
	public static boolean check(int R, int C, int N) {
		// 확인해야 할 종이의 첫번째 칸의 색
		int color = map[R][C]; 
		// 확인해야 할 종이의 색을 행우선순회로 검사
		for(int r=R; r<R+N; r++) {
			for(int c=C; c<C+N; c++) {
				if(map[r][c] != color) { // 첫번째 칸의 색과 같지 않은 색이 나온다면
					// 종이는 한가지 색으로 이루어져있지 않으므로
					// 더 검사해볼 필요없이 false를 반환
					return false;
				}
			}
		}
		
		// 위 if문에 걸리지 않았으면 종이는 하나기 색으로 이루어져있다는 것이므로
		// true를 반환
		return true;
	}
	
}
