// 1976. 시각 덧셈

// by SonMinji_220223

import java.util.Scanner;

public class SWEA_D2_1976 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int hour1 = sc.nextInt();
			int minute1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int minute2 = sc.nextInt();
			
			int hour;
			if(hour1 + hour2 <= 12) {
				hour = hour1 + hour2;
			} else {
				if((hour1 + hour2) % 12 != 0) {
					hour = (hour1 + hour2) % 12;
				} else {
					hour = 12;
				}
			}
            
			int minute;
			if(minute1 + minute2 <= 59) {
				minute = minute1 + minute2;
			} else {
				minute = minute1 + minute2 - 60;
				hour++;
			}
			System.out.printf("#%d %d %d\n", tcNum, hour, minute);
		}
	}
}
