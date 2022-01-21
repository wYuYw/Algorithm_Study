// 1089 : [기초-종합] 수 나열하기1

// by SonMinji

import java.util.Scanner;

public class CU1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		//int result = a+(d*(n-1));
		// 단순 반복문 연습하는 문제라서 아래처럼 for 이용해서 코드 다시 작성
		int result = a;
		for(int i=1; i<n; i++) {
			result += d;
		}
		System.out.println(result);
	}
}
