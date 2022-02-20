// 2007. 패턴 마디의 길이

// by SonMinji_220220

import java.util.Scanner;

public class SWEA_D2_2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String str = sc.next();
			check: for(int j=1; j<30; j++) {
				int i = 0;
				while(str.charAt(i)==str.charAt(j+i)) {
					if(i == j-1) {
						System.out.printf("#%d %d\n", tcNum, j);
						break check;
					}
					i++;
					continue;
				}
			}
		}
        
	}
}
