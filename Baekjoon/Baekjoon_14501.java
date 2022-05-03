// 14501. 퇴사

// by SonMinji_220503

import java.util.Scanner;

public class BJ14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 퇴사까지 남은 날   즉, 상담 가능한 일 수 (1 <= N <= 15)
		int N = sc.nextInt();
		// 상담 일정표
		int[][] schedule = new int[N+1][2];
		for(int n=1; n<=N; n++) {
			// 상담 완료하는 데 걸리는 기간 (1 <= T <= 5)
			schedule[n][0] = sc.nextInt();
			// 상담했을 때 받을 수 있는 금액 (1 <= P <= 1,000)
			schedule[n][1] = sc.nextInt();
		}
		
		// 각 날까지의 최대 수익 저장할 배열
		int[] maxProfit = new int[N+1];
		
		// 일정표 체크하며 각 날까지의 최대 수익 구하기
		for(int n=1; n<N+1; n++) {
			// 각 날까지의 최대 수익 저장할 변수
			// 0이 아니라 그 전 날 값으로 초기화
			// 해당 날 끝나는 상담 없으면 그 날까지의 최대 수익은 전날과 같음
			int max = maxProfit[n-1];
			
			// n날에 끝나는 상담이 있는지 확인하고 있으면 수익에 더하여 최대 수익 구하기
			for(int t=5; t>=1; t--) { // 상담 기간은 최대 5일
				// n날에 끝날 수 있는 상담을 가지고 있을 수도 있는 날 
				int d = n-t+1;
				if(d>0 && schedule[d][0] == t) {
				// 날짜는 1일부터 시작이니 날을 의미하는 d는 0보다 커야 하고
				// schedule[d][0] == t이면 d날 시작한 상담이 n날 끝난 경우임
          
					// n날까지의 수익은 maxProfit[d-1]+schedule[d][1]
					// d-1날까지의 최대 수익 + d날부터 n날까지 진행한 상담 비용
					// 따라서 지금까지 구해 본 n날까지의 수익 최댓값과 비교하여 더 큰 값을 저장
					max = Math.max(max, maxProfit[d-1]+schedule[d][1]);
				}
			}
      
			// 최종적으로 구해진 max가 n날까지의 최대 수익이므로 배열에 저장함
			maxProfit[n] = max;
		}
		
		// 결과 출력
		System.out.println(maxProfit[N]);
	}
}
