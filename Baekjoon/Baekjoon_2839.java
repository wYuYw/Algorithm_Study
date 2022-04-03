// 2839. 설탕 배달

// by SonMinji_220403

import java.util.Scanner;

public class BJ2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배달할 설탕의 무게 (3 <= N <= 5000)
		int N = sc.nextInt();
		
    // 배열의 인덱스에 해당하는 정수킬로그램의 설탕을 배달하는 데 사용하는 봉지 최소 개수를 저장할 배열
		// 인덱스를 입력되는 정수와 일치하게 사용하려고 배열을 하나 크게 만듬
		int[] dp = new int[N+1];
		// 3킬로그램 봉지와 5킬로그램 봉지가 있음
		dp[3] = 1;
		// N은 3부터 입력 가능하므로 N이 5보다 클 경우에만 dp[5] = 1로 해줌
		if(N>=5) dp[5] = 1;
		for(int i=6; i<=N; i++) {
			// 3킬로그램과 5킬로그램 봉지밖에 없으니 i-3과 i-5까지 사용한 봉지 개수 파악해서
			// 더 적은 봉지 개수를 사용한 것에 +1 해준 만큼이 i킬로그램 설탕을 담는 데 필요한 봉지 개수
			int val1 = dp[i-3];
			int val2 = dp[i-5];
			
			// 가진 봉지로 정확하게 N킬로그램을 배달해야 하므로 봉지 개수가 0인 것은 배달 못한다는 것 
			if(val1 != 0 && val2 != 0) {
				dp[i] = Math.min(val1, val2) + 1;
			} else if(val1 == 0 && val2 != 0) {
				dp[i] = val2 + 1;
			} else if(val1 != 0 && val2 == 0) {
				dp[i] = val1 + 1;
			}
			// val1과 val2 둘 다 0일 경우는 어차피 dp[i]도 0이므로 따로 처리해줄 게 없음
		}
		
		// 결과 출력
		// 정확하게 N킬로그램을 만들 수 없다면(배열 값이 0이라면) -1 출력
		System.out.println(dp[N] == 0 ? -1 : dp[N]);
	}
}
