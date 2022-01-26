// 1287 : 구구단을 *로 출력하기

// by SonMinji_220126

import java.util.Scanner;

public class CU1287 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		String result = "";
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=dan; j++) {
				result += "*";
			}
			System.out.println(result);
		}
    
	}	
}
