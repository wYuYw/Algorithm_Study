// 9095. 1, 2, 3 더하기

// by SonMinji_220331

import java.util.Scanner;

public class BJ9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 T
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) { // 각 테스트 케이스마다
			// 정수 n (0 < n < 11)
			int n = sc.nextInt();
			
			// 문제에서 n < 11이라고 해서 값 저장하는 배열의 길이를 11로 만듬
			// dp[idx] : 정수 idx를 1, 2, 3의 합으로 나타내는 방법의 수
			int[] dp = new int[11];
			// 1을 1, 2, 3의 합으로 나타내는 방법 1개 (1)
			dp[1] = 1;
			// 2를 1, 2, 3의 합으로 나타내는 방법 2개 (1+1, 2)
			// 1을 나타내는 방법 개수 1개 (1을 나타낸 것에 1을 더하면 됨) + 1개 (2)
			dp[2] = 2;
			// 3을 1, 2, 3의 합으로 나타내는 방법 4개 (1+1+1, 2+1, 1+2, 3)
			// 2를 나타내는 방법 개수 2개 (2를 나타낸 각각의 식에 1을 더하면 됨) 
			// + 1을 나타내는 방법 개수 1개 (1을 나타낸 각각의 식에 2를 더하면 됨)
			// + 1개 (3)
			dp[3] = 4;
			for(int i=4; i<=n; i++) {
				// 즉, i를 1, 2, 3의 합으로 나타내는 방법의 수는 아래와 같이 표현됨
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			 
			// 결과 출력
			System.out.println(dp[n]);
		}
	}
}
