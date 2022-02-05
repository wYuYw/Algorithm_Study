// 1164 : 터널 통과하기 1

// by SonMinji_220205

import java.util.Scanner;

public class CU1164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] tHeight = new int[3];
		for(int i=0; i<3; i++) {
			tHeight[i] = sc.nextInt();
		}
		
		String result = "PASS";
		for(int i=0; i<3; i++) {
			if(tHeight[i] <= 170) {
				result = "CRASH";
				break;
			}
		}
		System.out.print(result);
	}
}
