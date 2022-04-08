// 10163. 색종이

// by SonMinji_220408

import java.util.Scanner;

public class BJ10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 색종이 장 수 (1 <= N <= 100)
		int N = sc.nextInt();
		// 색종이 놓는 평면 (가로 세로 각각 최대 1001칸)
		int[][] map = new int[1001][1001];
		for(int n=1; n<=N; n++) { // 각 색종이마다
			// 색종이 시작 위치 (배열 상에서 왼쪽 위 좌표)
			// 열 좌표
			int C = sc.nextInt();
			// 행 좌표
			int R = sc.nextInt();
			// 색종이의 가로 길이
			int W = sc.nextInt();
			// 색종이의 세로 길이
			int H = sc.nextInt();
			// 평면에 색종이 번호 표시하기
			for(int r=R; r<R+H; r++) {
				for(int c=C; c<C+W; c++) {
					map[r][c] = n;
				}
			}
		}
		
		// 색종이 다 놓은 후 각 색종이마다 보이는 면적 구하기
		// 각 색종이별 면적 저장할 배열
		// 색종이 번호와 인덱스를 맞춰 면적을 저장하기 위해 배열을 N+1 크기로 만듬
		int[] size = new int[N+1];
		// 평면에 보이는 색종에 번호에 해당하는 size배열의 인덱스의 값 하나 증가
		for(int r=0; r<1001; r++) {
			for(int c=0; c<1001; c++) {
				if(map[r][c] != 0) {
					size[map[r][c]]++;
				}
			}
		}
		
		// 결과 출력
		for(int i=1; i<=N; i++) {
			System.out.println(size[i]);			
		}
	}
}
