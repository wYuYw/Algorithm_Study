// Baekjoon_2941 크로아티아 알파벳

// by SonMinji_220321

import java.util.Scanner;

public class BJ2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    
		String resultStr = str;
		for(int i=0; i<alphabet.length; i++) {
			resultStr = resultStr.replaceAll(alphabet[i], "A");
		}
		
		System.out.println(resultStr.length());
	}
}
