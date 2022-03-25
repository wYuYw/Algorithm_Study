// 3052. 나머지

// by SonMinji_220325

import java.util.Scanner;

public class BJ3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[42];
		int cnt = 0;
		for(int i=0; i<10; i++) {
			int r = sc.nextInt()%42;
			if(arr[r] == 0) {
				cnt++;
				arr[r]++;
			}
		}
		System.out.println(cnt);
	}
}
