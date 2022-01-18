// 1545. 거꾸로 출력해 보아요

import java.util.Scanner;

public class SWEA1545 {
	public static void main(String[] args) {
		// 입력받은 숫자부터 0까지 내림차순으로 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=N; i>=0; i--) {
			System.out.printf("%d ", i);
		}
	}
}
