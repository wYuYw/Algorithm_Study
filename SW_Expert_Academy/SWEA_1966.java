// 1966. 숫자를 정렬하자

// by SonMinji_220220

import java.util.Scanner;

public class SWEA_D2_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int idx=0; idx<N; idx++) {
				arr[idx] = sc.nextInt();
			}
			
			for(int i=N-1; i>=0; i--) {
				for(int j=0; j<i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<N; i++) {
				sb.append(" "+arr[i]);
			}
			String result = sb.toString();
			System.out.printf("#%d%s\n", tcNum, result);
		}
	}
}
