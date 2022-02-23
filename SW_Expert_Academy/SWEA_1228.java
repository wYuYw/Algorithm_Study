// 1228. [S/W 문제해결 기본] 8일차 - 암호문1

// by SonMinji_220223

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SWEA_D3_1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tcNum = 1; tcNum <= 10; tcNum++) {
			int N = sc.nextInt();
			List<Integer> code = new LinkedList<Integer>();
			for(int i=0; i<N; i++) {
				code.add(sc.nextInt());				
			}
			
			int cmdCnt = sc.nextInt();
			for(int i=0; i<cmdCnt; i++) {
				sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int j=0; j<y; j++) {
					code.add(x+j, sc.nextInt());
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int idx=0; idx<10; idx++) {
				sb.append(" "+code.get(idx));
			}
			String result = sb.toString();
			System.out.printf("#%d%s\n", tcNum, result);
		}

	}
}
