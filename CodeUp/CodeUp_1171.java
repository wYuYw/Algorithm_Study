// 1171 : 당신의 학번은? 2

// by SonMinji_220126

import java.util.Scanner;

public class CU1171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d%02d%03d", a, b, c);
	}
}


// Solution02 by SonMinji_220126
// 카테고리가 if ~ else여서 if문 사용하는 코드도 작성
/*
import java.util.Scanner;

public class CU1171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		String strb = Integer.toString(b);
		if(b<10) {
			strb = "0"+b;
		}
		String strc = Integer.toString(c);
		if(c<10) {
			strc = "00"+c;
		} else if(c<100) {
			strc = "0"+c;
		} 
		
		System.out.printf("%d%s%s", a, strb, strc);
	}
}
*/
