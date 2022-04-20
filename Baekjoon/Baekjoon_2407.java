// 2407. 조합

// by SonMinji_220420

import java.math.BigInteger;
import java.util.Scanner;

public class BJ2407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nCm 출력하기 위해 n과 m 입력받기
		// (5 <= m <= n <= 100)
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 조합 결과 배열 생성
		// n, m이 100까지 가능하므로 조합 결과가 저장되는 배열을
		// 큰 숫자를 저장할 수 있는 BigInteger타입으로 생성
		BigInteger[][] comb = new BigInteger[101][101];
		// 배열에 조합 결과 값 채우기 
		// n: 행, m: 열
		for(int N=0; N<101; N++) {
			for(int M=0; M<101 && M<=N; M++) { 
			// M은 N보다 클 수 없으므로 for문에서 조건을 주어 for문 도는 횟수를 줄임
				if(M == 0 || M == N) { // nC0이거나 nCn인 경우
					// nC0 = nCn = 1
					// BigInteger타입 배열이므로 값을 넣어줄 때도 BigInteger타입으로 넣어줘야 함
					comb[N][M] = new BigInteger("1");
				} else { // 그 외 나머지 경우
					// BigInteger 값 더하기 (참고 https://coding-factory.tistory.com/604)
					// BigInteger 타입으로 만들어진 배열이라서 
					// 배열의 값은 타입이 BigInteger인 상태이므로 그냥 갖다 쓰면 됨
					comb[N][M] = comb[N-1][M].add(comb[N-1][M-1]);
				}
			}
		}
		
		// 결과 출력
		System.out.println(comb[n][m]);
	}
}
