// 5525. IOIOI

// by SonMinji_220519

import java.util.Scanner;

public class BJ5525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수 (1 <= N <= 1,000,000)
		int N = sc.nextInt();
		// S의 길이 (2N+1 <= M <= 1,000,000)
		int M = sc.nextInt();
		// I와 O로만 이로어진 문자열
		String S = sc.next();
		
		// S에 Pn(n+1개 I와 n개 O이 교대로 나오는 문자열)이 포함되는 개수
		int cnt = 0;
		// S 문자열의 문자가 I여야 할 때는 true, O여야 할 때는 false
		boolean check = true;
		// 인덱스 저장
		int idx = -1;
		
		// 문자열 S 확인하며 개수 세기
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == 'I' && idx == -1) { // 해당 문자가 I이고 idx가 초깃값인 -1인 경우 
				// 이 문자부터 Pn 형식의 문자열이 있는지 체크
				// 현재 인덱스를 idx에 저장
				idx = i;
				// 다음 문자는 'O'가 와야하므로 그걸 알려주는 check 변수를 반대인 false로 저장
				check = !check;
			} else if(idx != -1) { // 앞 문자에 이어서 연달아 체크하고 있는 중일 경우
				if(check && S.charAt(i) == 'I' || !check && S.charAt(i) == 'O') {
				// 해당 위치에 맞는 문자가 온 경우
					// 다음 문자도 검사하도록 check 변수를 반대로 저장
					check = !check;
					
					if(i == S.length()-1) { // 마지막 문자인 경우
					// 지금까지 나온 문자열 보고 개수 더해줘야 함
						// 지금까지 I와 O가 교대로 나온 문자열  Pn의 n을 구함
						int n = (i-idx)/2;
						// Pn 문자열에서 PN 문자열의 개수는 n-N이 0보다 크거나 같을 때 n-N+1
						if(n-N >= 0) {
							cnt += n-N+1;
						}
					}
				} else { // 앞 문자와 교대로 문자가 나오지 않은 경우 (=앞문자와 같은 문자가 나온 경우)
					// 지금까지 교대로 나온 문자열의 길이 구함
					int diff = i-idx;
					// 문자열 Pn의 n 구하기 (diff가 짝수일 때는 -1 해서 2로 나눈 값이 n)
					int n = (diff%2 != 0 ? diff : diff-1)/2;
					// Pn 문자열에서 PN 문자열의 개수는 n-N이 0보다 크거나 같을 때 n-N+1
					if(n-N >= 0) {
						cnt += n-N+1;
					}
					
					// idx 다시 초기화
					idx = -1;
					// check도 다시 초기화
					check = true;
					// 이번 문자가 I인 경우
					if(S.charAt(i) == 'I') {
						// 이 문자부터 다시 검사해야하므로 i를 하나 줄여줌
						// 반복문 다시 시작하면서 i++되니까 
						// 이렇게 되면 다음번에 이번 문자부터 다시 검사하게 됨
						i = i-1;
					}
				}
			}			
		}
		
		// 결과 출력
		System.out.println(cnt);
	}
}
