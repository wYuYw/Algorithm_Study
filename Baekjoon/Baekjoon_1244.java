// Baekjoon_1244 스위치 켜고 끄기

// by SonMinji_220227

import java.util.Scanner;

public class BJ1244 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] onoff = new int[N+2];
		onoff[0] = 2;
		for(int i=1; i<=N; i++) {
			onoff[i] = sc.nextInt();
		}
		onoff[N+1] = 2;
		
		int S = sc.nextInt();
		for(int i=0; i<S; i++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();
			switch(gender) {
			case 1:
				for(int n=1; n<=N; n++) {
					if(n % num == 0) {
						onoff[n] = (onoff[n] == 1) ? 0 : 1;
					}
				}
				break;
			case 2:
				int idx1 = num;
				int idx2 = num;
				while(onoff[idx1]==onoff[idx2]) {
					idx1--;
					idx2++;
				}
				
				for(int idx=idx1+1; idx<idx2; idx++) {
					onoff[idx] = (onoff[idx] == 1) ? 0 : 1;
				}
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			if(i % 20 == 0) {
				sb.append(onoff[i]+"\n");
			} else if(i == N) {
				sb.append(onoff[i]);
			} else {
				sb.append(onoff[i]+" ");
			}
 		}
		System.out.print(sb);
    
	}
}
