// 1983. 조교의 성적 매기기

// by SonMinji_220210

import java.util.Scanner;

public class SWEA_D2_1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int k = sc.nextInt();
			double[] totalArr = new double[N];
			for(int idx=0; idx<N; idx++) {
				int mScore = sc.nextInt();
				int fScore = sc.nextInt();
				int aScore = sc.nextInt();
				double total = mScore*0.35 + fScore*0.45 + aScore*0.2;
				totalArr[idx] = total;
			}
      
			int kRank = 1;
			for(int idx=0; idx<N; idx++) {
				if(totalArr[k-1] < totalArr[idx]) {
					kRank++;
				}
			}
      
			int sameResultCnt = N/10;
			String kResult1 = "";
			String kResult2 = "";
			int resultSection1 = (kRank-1) / (sameResultCnt*3);
			int resultSection2 = ((kRank-1) % (sameResultCnt*3)) / sameResultCnt;
      
			if(resultSection1 == 0) {
				kResult1 = "A";
			} else if(resultSection1 == 1) {
				kResult1 = "B";
			} else if(resultSection1 == 2) {
				kResult1 = "C";
			} else if(resultSection1 == 3) {
				kResult1 = "D0";
			}
			if(resultSection1 != 3) {
				if(resultSection2 == 0) {
					kResult2 = "+";
				} else if(resultSection2 == 1) {
					kResult2 = "0";
				} else {
					kResult2 = "-";
				}
			}
			System.out.printf("#%d %s%s\n", tcNum, kResult1, kResult2);
		}
		
	}
}
