// 1408 : 암호 처리

// by SonMinji_220204

import java.util.Scanner;

public class CU1408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str1 = "";
		String str2 = "";
    
		for(int i=0; i<str.length(); i++) {
			str1 += (char)( (int)str.charAt(i)+2 );
			str2 += (char)( ((int)str.charAt(i)*7) % 80 + 48 );
		}
		System.out.printf("%s\n%s", str1, str2);
	}
}
