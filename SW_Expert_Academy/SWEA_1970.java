// 1970. 쉬운 거스름돈

// by SonMinji_220225

import java.util.Scanner;

public class SWEA_D2_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			for(int i=0; i<arr.length; i++) {
				sb.append(N / arr[i] + " ");
				N = N % arr[i];
			}

			String result = sb.toString();
			System.out.println("#"+tcNum);
			System.out.println(result);
		}
	}
}
