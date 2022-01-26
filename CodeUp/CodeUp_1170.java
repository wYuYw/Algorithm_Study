// 1170 : 당신의 학번은? 1

// by SonMinji_220126

import java.util.Scanner;

public class CU1170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d%d%02d", a, b, c);
	}
}


// Solution02 by SonMinji_220126
// 카테고리가 if ~ else여서 if문 사용하는 코드도 작성
/*
import java.util.Scanner;

public class CU1170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c<10) {
			System.out.printf("%d%d%s", a, b, "0"+c);
		} else {
			System.out.printf("%d%d%d", a, b, c);
		}
		
	}
}
*/
