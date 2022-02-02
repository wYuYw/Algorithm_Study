// 1162 : 당신의 사주를 봐 드립니다 1

// by SonMinji_220202

import java.util.Scanner;

public class CU1162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int n = year - month + day;
		if(n % 10 == 0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
	}
}
