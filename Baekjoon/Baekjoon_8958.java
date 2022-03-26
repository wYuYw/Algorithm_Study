// 8958. OX퀴즈

// by SonMinji_220326

import java.util.Scanner;

public class BJ8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			String ox = sc.next();
			int score = 0;
			int cnt = 0;
			for(int i=0; i<ox.length(); i++) {
				if(ox.charAt(i) == 'X') {
					cnt = 0;
				} else {
					cnt++;
					score += cnt;
				}
			}
			
			System.out.println(score);
		}
	}
}
