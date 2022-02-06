// 1230 : 터널 통과하기 2

// by SonMinji_220206

import java.util.Scanner;

public class CU1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tArr = new int[3];
		for(int i=0; i<3; i++) {
			tArr[i] = sc.nextInt();
		}
    
    String result = "PASS";
		for(int i=0; i<3; i++) {
			if(tArr[i] <= 170) {
				result = "CRASH "+tArr[i];
				break;
			}
		}
		System.out.println(result);
	}
}
