// 1361 : 별 계단 만들기

// by SonMinji_220203

import java.util.Scanner;

public class CU1361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = "**";
		for(int i=1; i<=n; i++) {
			System.out.println(str);
			str = " "+str;
		}
	}
}
