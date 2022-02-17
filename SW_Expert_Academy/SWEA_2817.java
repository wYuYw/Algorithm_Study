// 2817. 부분 수열의 합

// by SonMinji_220217

import java.util.Scanner;

public class SWEA_D3_2817 {

	static int cnt = 0;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int K = sc.nextInt(); 
			arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			sum(0, 0, K);
			
			System.out.printf("#%d %d\n", tcNum, cnt);
			cnt=0;
		}
	}
	
	static void sum(int idx, int sum, int K) {
		if(idx == arr.length) {
			if(sum == K) {
				cnt++;
			}
			return;
		}
		
		// 원소 포함
		sum(idx+1, sum+arr[idx], K);
		// 원소 미포함
		sum(idx+1, sum, K);
	}

}
