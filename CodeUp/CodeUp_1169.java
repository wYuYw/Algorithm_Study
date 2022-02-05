// 1169 : 나이 계산 2

// by SonMinji_220205

import java.util.Scanner;

public class CU1169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		int year = (2012-age+1) % 100;
		int y;
		if((2012-age+1)/100 == 20) {
			y = 3;
		} else {
			y = 1;
		}
		System.out.print(year+" "+y);
	}
}
