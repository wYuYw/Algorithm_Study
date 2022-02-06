// 1273 : 약수 구하기

// by SonMinji_220206

import java.util.Scanner;

public class CU1273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String str = "";
		for(int i=1; i<N; i++) {
			if(N % i == 0) {
				str += i+" ";
			}
		}
		str += N;
		System.out.println(str);
	}
}
