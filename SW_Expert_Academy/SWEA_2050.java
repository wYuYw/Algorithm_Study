// 2050. 알파벳을 숫자로 변환 

import java.util.Scanner;

public class SWEA2050 {
	public static void main(String[] args) {
		// 알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			int nstr = (int)str.charAt(i);
			System.out.printf("%d ", nstr-64);
		}
	}
}
