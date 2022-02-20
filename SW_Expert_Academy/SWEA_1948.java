// 1948. 날짜 계산기

// by SonMinji_220220

import java.util.Scanner;

public class SWEA_D2_1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2= sc.nextInt();
			int day2 = sc.nextInt();
			
			int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
			int result = 0;
			
			if(month1 != month2) {
				for(int month=month1; month<month2; month++) {
					result += day[month]; 
				}
				result += day2 - day1 + 1;
			} else {
				result = day2 - day1 + 1;
			}
			
			System.out.printf("#%d %d\n", tcNum, result);
		}
		
	}
}
