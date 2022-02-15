// 5432. 쇠막대기 자르기

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D4_5432re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String str = sc.next();
			char[] charArr = str.toCharArray();
			int pieceSum = 0;
			int stick = 0;
			
			for(int i=0; i<charArr.length; i++) {
				if(charArr[i] == '(') {
					stick++;
				} else {
					if(charArr[i-1] == '(') {
						stick--;
						pieceSum += stick;
					} else {
						stick--;
						pieceSum++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, pieceSum);
		}
	}
}
