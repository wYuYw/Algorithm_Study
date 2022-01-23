// 1082 : [기초-종합] 16진수 구구단?

// by SonMinji_220123

import java.util.Scanner;

public class CU1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10진수 -> 16진수
		// Integer.toHexString(16진수로 바꿀 10진수 숫자);
		// 16진수 -> 10진수
		// Integer.parseInt(16진수 값, 16);
		// Integer.parseInt(String s, int radix); 
		// radix진수인 s값을 10진수 int로 변환
		
		String strn = sc.next();
		int n = Integer.parseInt(strn, 16);
		int num = Integer.parseInt("f", 16);
		for(int i=1; i<=num; i++) {
			String result = Integer.toHexString(n*i);
			// 16진수로 바꿔도 영어가 소문자로 나와서 문제에 있는 대로 대문자로 출력하기 위해서 toUpperCase() 사용함
			System.out.printf("%s*%s=%s\n", strn, Integer.toHexString(i).toUpperCase(), result.toUpperCase());
		}
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(16);
		
		for(int i=1; i<16; i++) {
			System.out.printf("%X*%X=%X%n", n, i, n*i);
		}
	}
}
*/
