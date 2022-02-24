// 1946. 간단한 압축 풀기

// by SonMinji_220225

import java.util.Scanner;

public class SWEA_D2_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			char[] alphabet = new char[N];
			int[] number = new int[N];
			for(int i=0; i<N; i++) {
				alphabet[i] = sc.next().charAt(0);
				number[i] = sc.nextInt();
			}
			
			int cnt = 0;
			StringBuilder sb = new StringBuilder();
			System.out.println("#"+tcNum);
			for(int i=0; i<N; i++) {
				for(int j=0; j<number[i]; j++) {
					sb.append(alphabet[i]);
					cnt++;
					if(cnt==10) {
						String result = sb.toString();
						System.out.println(result);
						sb.delete(0, 10);
						cnt = 0;
					}
					
				}
			}
			String result = sb.toString();
			System.out.println(result);
		}
	}
}
