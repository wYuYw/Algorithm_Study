// 1859. 백만 장자 프로젝트

// by SonMinji_220213

import java.util.Scanner;

public class SWEA_D2_1859 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tcNum = 1; tcNum <= T; tcNum++) {
			
			int day = sc.nextInt();
			int[] valArr = new int[day];
			for (int idx = 0; idx < day; idx++) {
				valArr[idx] = sc.nextInt();
			}

			int idx = 0;
			int maxVal = 0;
      // 2 <= day <= 1,000,000
      // 각 날의 매매가는 10,000 이하
			// 따라서 int 아니라 long
			long maxProfit = 0;
			
			while(idx < day) {
				for(int i = idx; i < day; i++) {
					maxVal = Math.max(maxVal, valArr[i]);
				}
				
				// 첫번째 값이 최대값일 때
				if(maxVal == valArr[idx]) {
					maxVal = 0;
					idx++;
					continue;
				}
				
				for(int i = idx; i < day; i++) {
					if(valArr[i] == maxVal) {
						maxVal = 0;
						idx = i+1;
						break;
					} else {
						maxProfit += (maxVal-valArr[i]);
					}
				}
			}
      
			System.out.printf("#%d %d\n", tcNum, maxProfit);
		}

	}
}
