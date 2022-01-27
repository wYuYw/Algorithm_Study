// 1412 : 알파벳 개수 출력하기

// by SonMinji_220127

import java.util.Scanner;

public class CU1412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// a = 97
		// z = 122
		
		// 정규식 & replace와 replaceAll 차이 알기 
		// String str1 = str.replace("[^a-z]", "");
		String reStr = str.replaceAll("[^a-z]","");

		int arrLength = 122-97+1;
		int[] arr = new int[arrLength];
		for(int i=0; i<reStr.length(); i++) {
			int num = (int)reStr.charAt(i);
			arr[num-97] += 1 ;
		}
		for(int i=0; i<arrLength; i++) {
			System.out.printf("%c:%d\n", (char)i+97, arr[i]);
		}
	
	}
}
