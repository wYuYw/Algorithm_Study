// 5356. 의석이의 세로로 말해요

// by SonMinji_220223

import java.util.Scanner;

public class SWEA_D3_5356re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = 5;
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String[] word = new String[N];
			int max = 0;
			for(int i=0; i<N; i++) {
				word[i] = sc.next();
				max = Math.max(max, word[i].length());
			}
			
			StringBuilder sb = new StringBuilder();
			for(int c=0; c<max; c++) {
				for(int r=0; r<N; r++) {
					if(c<word[r].length()) {
						sb.append(word[r].charAt(c));						
					}
				}
			}
			
			String result = sb.toString();
			System.out.printf("#%d %s\n", tcNum, result);
		}
	}
}
