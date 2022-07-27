// 1436. 영화감독 숌

// by SonMinji_220727

import java.util.Scanner;

public class BJ1436 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// N번째 영화
		int N = sc.nextInt();
		
		if(N <= 6) { // 입력된 N이 6보다 작거나 같은 경우
			// 제일 작은(첫번째) 종말 숫자가 666이므로 
			// 영화 제목에 들어갈 수는 666 + (N-1)*1000
			System.out.println(666 + (N-1)*1000);
		} else { // 입력된 N이 6보다 클 경우
			// 앞으로 찾아야 할 종말 숫자 개수
			int cnt = N-6;
			// 5666 다음 종말 숫자는 6666이 아니라 6660임
			int n = 6659;
			while(cnt != 0) { // 더 찾아야 할 종말 숫자 개수가 0이 될 때까지 반복
				// 6659부터 숫자 하나씩 증가
				n++;
				if(String.valueOf(n).contains("666")) { // 해당 숫자에 666이 포함되어 있는 경우
					// 앞으로 찾아야 할 종말 개수 하나 감소
					cnt--;
				}
			}
			// 결과 출력 (N번째 종말 숫자)
			System.out.println(n);
		}
		
	}
}
