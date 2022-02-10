// 1959. 두 개의 숫자열

// by SonMinji_220210

import java.util.Scanner;

public class SWEA_D2_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arrA = new int[N];
			int[] arrB = new int[M];
			for(int idx=0; idx<N; idx++) {
				arrA[idx] = sc.nextInt();
			}
			for(int idx=0; idx<M; idx++) {
				arrB[idx] = sc.nextInt();
			}

			int[] shortArr = arrA;
			int[] longArr = arrB;
			if(N>M) {
				shortArr = arrB;
				longArr = arrA;
			}
			
			int maxSum = Integer.MIN_VALUE;
			for(int longIdx=0; longIdx<=longArr.length-shortArr.length; longIdx++) {
				int sum = 0;
				for(int shortIdx=0; shortIdx<shortArr.length; shortIdx++) {
					sum += shortArr[shortIdx]*longArr[longIdx+shortIdx];
				}
				maxSum = Math.max(maxSum, sum);
			}
			System.out.printf("#%d %d\n", tcNum, maxSum);
		}
	}
}
