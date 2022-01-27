// 2721 : 순환 문자열

// by SonMinji_220127

import java.util.Scanner;

public class CU2721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();

		boolean b1 = s1.substring(s1.length()-1).equals(s2.substring(0, 1));
		boolean b2 = s2.substring(s2.length()-1).equals(s3.subSequence(0, 1));
		boolean b3 = s3.substring(s3.length()-1).equals(s1.subSequence(0, 1));
		
		if(b1 && b2 && b3) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}
}
