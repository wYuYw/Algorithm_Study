// 8320. 직사각형을 만드는 방법

// by SonMinji_220327

import java.util.Scanner;

public class BJ8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int square = N;
		int cnt = N;
		for(int i=2; cnt>2; i++) {
			cnt = 0;
			for(int j=i; i*j <= N; j++) {
				square++;
				cnt++;
			}
		}
		
		System.out.println(square);
	}
}
