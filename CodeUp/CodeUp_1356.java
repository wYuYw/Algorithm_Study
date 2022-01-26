// 1356 : 사각형 출력하기 2

// by SonMinji_220126

import java.util.Scanner;

public class CU1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			String str = "";
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n) {
					str += "*";
				} else {
//					if(j==1 || j==n) {
//						str += "*";
//					} else {
//						str += " ";
//					}
					str += j==1 || j==n ? "*" : " ";
				}
			}
			System.out.println(str);
		}
	}
}
