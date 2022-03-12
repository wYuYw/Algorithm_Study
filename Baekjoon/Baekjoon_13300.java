// Baekjoon_13300 방 배정

// by SonMinji_220312

import java.util.Scanner;

public class BJ13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] student = new int[2][7];
		for(int i=0; i<N; i++) {
			int S = sc.nextInt();
			int Y = sc.nextInt();
			student[S][Y]++;
		}
		
		int room = 0;
		for(int s=0; s<2; s++) {
			for(int y=1; y<=6; y++) {
				room += (student[s][y] / K);
				if(student[s][y] % K != 0) {
					room++;
				}
			}
		}
		
		System.out.println(room);
	}
}
