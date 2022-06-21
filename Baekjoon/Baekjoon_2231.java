// 2231. 분해합

// by SonMinji_220621

import java.util.Scanner;

public class BJ2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 어떤 자연수 M의 분해합 : N (1 <= N <= 1,000,000)
		// N = M + M을 이루는 각 자리수의 합
		int N = sc.nextInt();
		// N의 가장 작은 생성자 : M
		// 생성자가 없는 경우 0 출력해야하므로 0으로 초기화
		int M = 0;
		
		// 입력받은 N의 가장 작은 생성자 구하기
		// N의 자릿수
		int NLength = String.valueOf(N).length();
		// N이 될 수 있는 최대 숫자가 큰 수이기 때문에 무작정 0부터 다 체크하면 시간초과
		// N의 자릿수를 이용하여 생성자(M)인지 체크할 범위를 좁힘
		// N이 세자리 수라면 M은 최대 세자리 수이고 각 자리 수 합은 최대가 3*9=27 이므로
		// M이 될 수 있는 최소 숫자는 N-27이므로 여기부터 검사하면 됨
		// 따라서 일반화하면 N-(NLength*9)부터 생성자가 맞는지 체크
		for(int i=N-(NLength*9); i<N; i++) {
			if(i <= 0) { // i가 0보다 작거나 같은 경우 
				// M은 자연수이므로 해당 경우는 체크하지 않고 넘어감
				continue;
			}
      
			// 현재 i로 분해합 만들 경우 나오는 값을 저장할 변수. 현재 i 값으로 초기화
			int n = i;
			// i의 자릿수
			int iLength = String.valueOf(i).length();
			// i의 자릿수만큼 반복문 돌며 n에 i의 각 자릿수 값 더함
			for(int l=0; l<iLength; l++) {
				// i의 각 자릿수에 접근하기 위해 i를 String으로 만들고 charAt을 이용함
				// 문자이므로 '0'을 빼줘서 해당 자릿수의 일치하는 값을 n에 더함
				n += String.valueOf(i).charAt(l)-'0';
			}
      
			if(n == N) { // 현재 i로 만든 분해합인 n이 N과 같은 경우
				// 현재 i가 입력받은 N의 가장 작은 생성자가 됨
				M = i;
				// 가장 작은 생성자만 구하면 되므로 더이상 작업 반복할 필요 없음
				break;
			}
		}
		
		// 결과 출력 (N의 가장 작은 생성자)
		System.out.println(M);
	}
}
