// 1085. 직사각형에서 탈출

// by SonMinji_220609

import java.util.Scanner;

public class BJ1085 {
	public static void main(String[] args) {
		// 입력 받기 위해
		Scanner sc = new Scanner(System.in);
		// 현 위치 (x, y)
		// 1 <= x <= w-1
		// 1 <= y <= h-1
		int x = sc.nextInt();
		int y = sc.nextInt();
		// 직사각형의 왼쪽 아래 꼭짓점 (0, 0)
		// 직사각형의 오른쪽 위 꼭짓점 (w, h)
		// 1 <= w, h <= 1,000
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// 직사각형의 경계선까지 가는 거리의 최솟값
		// 꼭짓점이 아닌 경계선까지 가는 거리의 최솟값이니까 x, y, w-x, h-y 중 최솟값 구하면 됨
		int minDistance = x < y ? x : y;
		minDistance = Math.min(minDistance, w-x);
		minDistance = Math.min(minDistance, h-y);
		
		// 결과 출력
		System.out.println(minDistance);
	}
}
