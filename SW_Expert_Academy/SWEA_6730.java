// 6730. 장애물 경주 난이도

// by SonMinji_220319

import java.util.Scanner;

public class SWEA_D3_6730 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			int[] height = new int[N];
			for(int i=0; i<N; i++) {
				height[i] = sc.nextInt();
			}
			
			int up = 0;
			int down = 0;
			for(int i=0; i<N-1; i++) {
				if(height[i]<height[i+1]) {
					up = height[i]-height[i+1] < up ? height[i]-height[i+1] : up;
				} else {
					down = height[i]-height[i+1] > down ? height[i]-height[i+1] : down;
				}
			}
			
			up = Math.abs(up);
			System.out.printf("#%d %d %d\n", tcNum, up, down);
		}
	}
}
