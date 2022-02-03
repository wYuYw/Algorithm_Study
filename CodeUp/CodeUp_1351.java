// 1351 : 구구단 출력하기 2

// by SonMinji_220203

import java.util.Scanner;

public class CU1351 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startDan = sc.nextInt();
		int endDan = sc.nextInt();
		
		for(int dan=startDan; dan<=endDan; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
	}	
}
