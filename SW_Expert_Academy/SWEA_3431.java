// 3431. 준환이의 운동관리

// by SonMinji_220318

import java.util.Scanner;

public class SWEA_D3_3431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			int result = -1;
			if(X>=L && X<=U) {
				result = 0;
			} else if(X<L) {
				result = L-X;
			}
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}
}
