// 1357 : 삼각형 출력하기 4

// by SonMinji_220126

import java.util.Scanner;

public class CU1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n+n-1; i++) {
			String str = "";
			if(i<=n) {
				for(int j=1; j<=i; j++) {
					str += "*";
				}
			} else {
				for(int j=1; j<=n+n-i; j++) {
					str += "*";
				}
			}
			System.out.println(str);
		}
		
	}
}
