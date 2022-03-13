// Baekjoon_2810 컵홀더

// by SonMinji_220313

import java.util.Scanner;

public class BJ2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String seat = sc.next();
		String sSeat = seat.replaceAll("L", "");
		
		int Lcnt = seat.length()-sSeat.length();
		
		int result = (N+1)-(Lcnt/2) > N ? N : (N+1)-(Lcnt/2);
		
		System.out.println(result);
	}
}
