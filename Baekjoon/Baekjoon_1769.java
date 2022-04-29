// 1769. 3의 배수

// by SonMinji_220429

import java.util.Scanner;

public class BJ1769 {
	
	// 3의 배수인지 아닌지
	static boolean result;
	// 변환 과정 거친 횟수
	static int cnt;
	
	public static void main(String[] args) {
		// 값 입력 받기 위해
		Scanner sc = new Scanner(System.in);
		// 1,000,000자리 이하의 자연수
		String N = sc.next();
		
		// 입력받은 수가 3의 배수인지 문제 변환 과정을 통해 알아내기
		check(N);
		
		// 결과 출력
		System.out.printf("%d\n%s", cnt, result?"YES":"NO");
	}
	
	// 3의 배수인지 체크하기
	public static void check(String N) {
		//base case
		if(N.length() == 1) { // 한 자릿수가 된 경우
			if(Integer.parseInt(N)%3 == 0) { // 3의 배수일 경우
				result = true;
			}
			return;
		}
		
		// recursive case
		// 각 자리 수 합 저장할 변수
		int sum = 0;
		for(int i=0; i<N.length(); i++) {
			// 각 자리 수 합
			sum += N.charAt(i)-'0';
		}
		// 문제 변환 과정 거친 횟수 하나 증가
		cnt++;
		// 구한 각 자리 수 합을 문자열로 변환하여 재귀 호출
		check(Integer.toString(sum));
	}
	
}
