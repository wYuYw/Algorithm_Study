// 2609. 최대공약수와 최소공배수

// by SonMinji_220627

import java.util.Scanner;

public class BJ2609 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 자연수 입력 (10,000이하의 자연수)
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		/* 방법 1. 최소공배수 메서드 사용할 경우
		 * 
		if(n1 < n2) {
			System.out.println(GCD(n1, n2));
			System.out.println(LCM(n1, n2));
		} else {
			System.out.println(GCD(n2, n1));
			System.out.println(LCM(n2, n1));
		}
		 */
		
		// 방법2. 따로 최소공배수 메서드를 만들 필요없이 최대공약수를 이용해 최소공배수를 구하는 경우
		// 최대공약수
		// n2 < n1일 경우 최대공약수로 초기화
		int gcd = GCD(n2, n1);
		if(n1 < n2) { // n1 < n2일 경우
			// 최대공약수 재할당
			gcd = GCD(n1, n2);
		}
		// 결과 출력(최대공약수와 최소공배수)
		System.out.println(gcd);
		// 최소공배수 : 두 수 곱 / 최대공약수
		System.out.println(n1*n2/gcd);
	}
	
	// 최대공약수 구하는 메서드
	// 전제  num1 < num2 
	public static int GCD(int num1, int num2) {
		// 최대공약수 : 입력받은 두 수 중 작은 수보다 작거나 같은 수이면서
		// 입력받은 두 수를 나눌 경우 나머지가 없는 최대 수
		for(int n=num1; n>1; n--) {
			if(num1 % n == 0 && num2 % n == 0) {
				return n;
			}
		}
		return 1;
	}
	
	/*
	// 최소공배수 구하는 메서드
	// 전제  num1 < num2
	public static int LCM(int num1, int num2) {
		// 최소공배수 : 입력받은 두 수 중 큰 수보다 크거나 같은 수이면서
		// 입력받은 두 수로 나누어 떨어지는 최소 수
		for(int n=num2; n<num1*num2; n++) {
			if(n % num1 == 0 && n % num2 == 0) {
				return n;
			}
		}
		return num1*num2;
	}
	*/
	
}
