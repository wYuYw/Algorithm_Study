// 2019. 더블더블

import java.util.Scanner;

public class SWEA2019 {
	public static void main(String[] args) {
		// 1부터 주어진 횟수까지 2를 곱한 값(들)을 출력
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int a = 1;
		System.out.print(a);
		for(int i=1; i<=cnt; i++) {
			a *= 2;
			System.out.printf(" %d", a);
		}
	}
}
