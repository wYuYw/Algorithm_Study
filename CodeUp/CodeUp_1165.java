// 1165 : 축구의 신 1

// by SonMinji_220207

import java.util.Scanner;

public class CU1165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score = sc.nextInt();
		
		for(int t=time; t<90; t+=5 ) {
			score ++;
		}
		System.out.print(score);
	}
}
