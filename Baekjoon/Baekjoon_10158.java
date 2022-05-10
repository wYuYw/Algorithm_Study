// 10158. 개미

// by SonMinji_220510

import java.util.Scanner;

public class BJ10158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 격자 크기 (2 <= w, h <= 40000)
		int w = sc.nextInt();
		int h = sc.nextInt();
		// 개미 위치 (p,q)
		// 0 < p < w 
		// 0 < q < h
		int p = sc.nextInt();
		int q = sc.nextInt();
		// 개미가 움직일 시간 (1 <= t <= 200000000)
		int t = sc.nextInt();
		
		// t 시간 후 개미의 위치를 x좌표 y좌표 따로 생각하기
		// t 시간 후 개미의 위치 좌표 (x, y)
		
		// x좌표를 첫 시작 좌표인 p로 초기화
		int x = p;
		// 2w 시간 후 개미의 위치는 격자에서 가로 값이 p 
		// w 시간 후에도 개미의 위치는 p이지만 개미의 이동 방향이 첫 시작과 다름
		int restW = t%(2*w);
		// 개미 이동 방향이 우상향임을 나타내주는 변수
		boolean dx = true;
		// 남은 시간동안 개미 한 칸씩 이동시키기
		while(restW != 0) {
			if(dx) {
				x++;
			} else {
				x--;
			}
			restW--;
			// 격자의 벽을 만나면 이동 방향 바꾸기
			if(x == w || x == 0) {
				dx = !dx;
			}
		}
		
		// y좌표를 첫 시작 좌표인 q로 초기화
		int y = q;
		// 2h 시간 후 개미의 위치 중 격자에서 세로 값이 q
		// h 시간 후에도 개미의 위치는 q이지만 개미의 이동 방향이 첫 시작과 다름
		int restH = t%(2*h);
		// 개미 이동 방향이 우상향임을 나타내주는 변수
		boolean dy = true;
		// 남은 시간동안 개미 한 칸씩 이동시키기
		while(restH != 0) {
			if(dy) {
				y++;
			} else {
				y--;
			}
			restH--;
			// 격자의 벽을 만나면 이동 방향 바꾸기
			if(y == h || y == 0) {
				dy = !dy;
			}
		}
		
		// 결과 출력
		System.out.printf("%d %d", x, y);
	}
}
