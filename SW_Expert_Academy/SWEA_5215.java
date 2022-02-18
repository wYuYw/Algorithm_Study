// 5215. 햄버거 다이어트

// by SonMinji_220218

import java.util.Scanner;

public class SWEA_D3_5215 {
	
	static int N;
	static int Limit;
	static int[] scoreArr;
	static int[] calorieArr;
	
	static int maxScore;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			N = sc.nextInt();
			Limit = sc.nextInt();
			scoreArr = new int[N];
			calorieArr = new int[N];
			for(int idx=0; idx<N; idx++) {
				scoreArr[idx] = sc.nextInt();
				calorieArr[idx] = sc.nextInt();
			}
			best(0, 0, 0);
			
			System.out.printf("#%d %d\n", tcNum, maxScore);
			maxScore = 0;
		}
	}
	
	static void best(int idx, int sum, int score) {
		if(idx == N) {
			if(sum<=Limit) {
				maxScore = Math.max(maxScore, score);
			}
			return;
		}
		
		best(idx+1, sum+calorieArr[idx], score+scoreArr[idx]);
		best(idx+1, sum, score);
	}
}


