// 1978. 소수 찾기

// by SonMinji_220729

import java.util.Scanner;

public class BJ1978 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// 수의 개수 (N <= 100)
		int N = sc.nextInt();
		// 자연수 (num <= 1,000)
		int num;
		// 소수 개수
		int cnt = 0;
		// 각 수마다 소수인지 체크
		check: for(int n=1; n<=N; n++) {
			num = sc.nextInt();
			
			// 1은 소수가 아니므로 1이 입력된 경우 
			if(num == 1) {
				// 밑에 코드를 실행하지 않고 다시 반복문으로 돌아가 다음 숫자를 체크하도록 함
				continue;
			}
			
			// 1과 자기자신 외 다른 수로 나뉘는지 체크
			for(int c=2; c<num; c++) {
				// 나뉜다면
				if(num % c == 0) {
					// 소수가 아니므로 다시 check 반복문으로 돌아가 다음 숫자를 체크하도록 함
					continue check;
				}
			}
			
			// 위에서 걸러지지 않은 수는 소수이므로 소수 개수 하나 증가
			cnt++;
		}
		
		// 결과 출력 (소수 개수)
		System.out.println(cnt);
	}
}
