// 10250. ACM 호텔

// by SonMinji_220611

import java.util.Scanner;

public class BJ10250 {
	public static void main(String[] args) {
		// 입력 받기 위해
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		// 각 테스트 케이스마다
		for(int tcNum=1; tcNum<=T; tcNum++) {
			// 호텔의 층 수 (1 <= H <= 99)
			int H = sc.nextInt();
			// 호텔의 호 수 (1 <= W <= 99)
			int W = sc.nextInt();
			// 손님 수 (1 <= N <= H*W)
			int N = sc.nextInt();
			
			// 결과 출력
			// 손님에게 배정될 층 수 = 손님의 번째 수 % 호텔 층 수 , 배정될 호 수 = 손님의 번째 수 / 호텔 호 수
			int h = N%H;
			// 단, 위와 같이 계산할 경우 층 수와 손님 수가 같으면(h == 0) 제대로 방을 배정하지 못하므로 따로 처리해야 함
			if(h == 0) {
				System.out.println(H*100+(N/H));
			} else {
				System.out.println((N%H)*100+(N/H)+1);				
			}
		}
	}
}
