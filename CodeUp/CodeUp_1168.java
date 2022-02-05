// 1168 : 나이 계산 1

// by SonMinji_220205

import java.util.Scanner;

public class CU1168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yymmdd = sc.nextInt();
		int sex = sc.nextInt();
		
		int yy = yymmdd / 10000;
		if(sex <= 2) {
			yy += 1900;
		} else {
			yy += 2000;
		}
		System.out.println(2012-yy+1);
	}
}
