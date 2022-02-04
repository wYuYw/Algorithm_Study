// 1410 : 올바른 괄호 1 (괄호 개수 세기)

// by SonMinji_220204

import java.util.Scanner;

public class CU1410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i, i+1).equals("(")) {
				cnt1++;
			} else if(str.substring(i, i+1).equals(")")) {
				cnt2++;
			}
		}
		System.out.println(cnt1+" "+cnt2);
	}
}
