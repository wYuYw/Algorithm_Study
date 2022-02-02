// 1269 : 수열의 값 구하기

// by SonMinji_220202

import java.util.Scanner;

public class CU1269 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=2; i<=n ; i++) {
			a = (a*b)+c;
		}
		System.out.println(a);
	}
}
