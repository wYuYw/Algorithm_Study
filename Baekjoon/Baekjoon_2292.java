// Baekjoon_2292 벌집

// by SonMinji_220309

import java.util.Scanner;

public class BJ2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int i = 1;
		int n = 1;
		while(N>n) {
			n += (6*i);
			i++;
			cnt++;
		}
        
		System.out.println(cnt);
	}
}
