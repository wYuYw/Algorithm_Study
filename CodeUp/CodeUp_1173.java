// 1173 : 30분전

// by SonMinji_220207

import java.util.Scanner;

public class CU1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute-30 < 0) {
			if(hour != 0) {
				hour = hour - 1;
			} else {
				hour = 23;
			}
			minute = 60+minute-30;
		} else {
			minute = minute-30;
		}
		System.out.printf("%d %d", hour, minute);
	}
}
