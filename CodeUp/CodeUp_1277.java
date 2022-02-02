// 1277 : 몇 번째 데이터 출력하기

// by SonMinji_220202

import java.util.Scanner;

public class CU1277 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int firstData = 0;
		int midData = 0;
		int lastData = 0;
		for(int i=1; i<=N; i++) {
			if(i == 1) {
				firstData = sc.nextInt();				
			} else if (i == (N/2)+1) {
				midData = sc.nextInt();
			} else if(i == N) {
				lastData = sc.nextInt();
			} else {
				sc.nextInt();
			}
		}
		
		// 이 상태에서 그냥 출력하면 입력된 데이터가 1개일 때 firstData만 출력되고 나머지 두 개는 0으로 나옴
		//System.out.printf("%d %d %d", firstData, midData, lastData);
		if(N == 1) {
			System.out.printf("%d %d %d", firstData, firstData, firstData);
		} else {
		System.out.printf("%d %d %d", firstData, midData, lastData);
		}
	}
}
