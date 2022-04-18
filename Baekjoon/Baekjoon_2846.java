// 2846. 오르막길

// by SonMinji_220418

import java.util.Scanner;

public class BJ2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수열의 크기 (1 <= N <= 1000)
		int N = sc.nextInt();
		// 수열 저장할 배열
		int[] arr = new int[N];
		for(int n=0; n<N; n++) {
			// 수열의 각 수 입력
			// N개의 양의 정수 P (1 <= P <= 1000)
			arr[n] = sc.nextInt();
		}
		
		// 오르막길 시작점 초기화
		int st = 0;
		// 오르막길 끝점 초기화
		int ed = 0;
		// 가장 큰 오르막길 크기 저장해야하고
		// 오르막길이 없는 경우 0을 출력해야 하므로 0으로 초기화
		int max = 0;		
		
		// 인접한 두 수를 비교하여 오르막길인지 체크
		for(int n=1; n<N; n++) { 
		// 수열에서 현재 가리키는 값과 전 값을 비교할 거라서 n이 1부터 시작
			if(arr[n-1] - arr[n] < 0) { // 오르막길인 경우
				// 오르막길 시작점 저장
				st = arr[n-1];
				while(n < N && arr[n-1] - arr[n] < 0) {
				// n이 수열 배열의 범위 안에 있고, 오르막길이면
					// n을 증가시켜 다음 수열도 오르막길인지 확인
					n++;
				}
				// n이 수열 배열의 범위를 벗어나거나 오르막길이 아니면 
				// while문을 빠져나오게 되므로 오르막길 끝점 저장
				ed = arr[n-1];
				// 지금까지 구한 오르막길 크기 중 가장 큰 값 max와
				// 이번에 구한 오르막길 크기 ed-st를 비교하여
				// 큰 값을 max에 저장
				max = Math.max(max, ed-st);
			}
		}
		
		// 결과 출력
		System.out.println(max);
	}
}
