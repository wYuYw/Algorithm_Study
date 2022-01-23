// 1418 : t를 찾아라

// by SonMinji_220123

import java.util.Scanner;

public class CU1418 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			// if 조건문에 str.charAt(i).equals("t")하면 에러남
			// str.charAt(i)는 타입이 char이고 equals는 String을 비교하는 함수라서..
			if(str.substring(i,i+1).equals("t")) {
				System.out.print(i+1+" ");
			}
		}
		
	}
}
