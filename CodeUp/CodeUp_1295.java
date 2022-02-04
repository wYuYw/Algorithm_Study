// 1295 : 알파벳 대소문자 변환

// by SonMinji_220204

import java.util.Scanner;

public class CU1295 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// char은 작은따옴표 사용. 큰따옴표 아님. 
		// A : 65, Z : 90, a : 97, z : 122
//		char string = 'A';
//		System.out.println((int)string+", "+(int)'Z');
//		System.out.println((int)'a'+", "+(int)'z');
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
				// String과 char의 대소문자변환 메소드 적용 방법 다름 주의!
				// String의 경우)  str.toUpperCase()
				// char의 경우) Character.toLowerCase(str.charAt(i))
				arr[i] = Character.toLowerCase(str.charAt(i));
			} else if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) {
				arr[i] = Character.toUpperCase(str.charAt(i));
			// 영어가 아닌 문자도 입력되므로 그에 따른 출력도 해줘야 함!
			} else {
				arr[i] = str.charAt(i);
			}
			System.out.print(arr[i]);
		}
	}
}
