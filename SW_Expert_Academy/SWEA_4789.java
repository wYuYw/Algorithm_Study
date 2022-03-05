// 4789. 성공적인 공연 기획

// by SonMinji_220305

import java.util.Scanner;

public class SWEA_D3_4789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
      
			String strNum = sc.next();
			int employ = 0;
			int clap = 0;
			for(int idx=0; idx<strNum.length(); idx++) {
				if(strNum.charAt(idx) == '0') {
					if(clap < idx+1) {
						employ += (idx+1)-clap;
						clap += (idx+1)-clap;
					}
				} else {
					clap += (strNum.charAt(idx)-'0'); 
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, employ);
		}
	}
}
