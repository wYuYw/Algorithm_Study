// 1289. 원재의 메모리 복구하기

// by SonMinji_220225

import java.util.Scanner;

public class SWEA_D3_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String memory = sc.next();
			int cnt = 0;
			cnt = (memory.charAt(0) == '1') ? cnt+1 : cnt;
			for(int i=1; i<memory.length(); i++) {
				switch(memory.charAt(i-1)-memory.charAt(i)) {
				case 1: 
				case -1:
					cnt++;
					break;
				case 0:
				}
			}

			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
}
