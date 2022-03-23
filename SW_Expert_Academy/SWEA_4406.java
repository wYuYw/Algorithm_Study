// 4406. 모음이 보이지 않는 사람

// by SonMinji_220323

import java.util.Scanner;

public class SWEA_D3_4406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String str = sc.next();
			String[] arr = {"a", "e", "i", "o", "u"};
			for(int i=0; i<arr.length; i++) {
				str = str.replaceAll(arr[i], "");
			}
            
			System.out.printf("#%d %s\n", tcNum, str);
		}
	}
}
