// 2072. 홀수만 더하기

// by SonMinji
import java.util.Scanner;

public class SWEA2072 {
	public static void main(String[] args) {
		// 10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		for(int i=1; i<=count; i++) {
			int sum = 0;
			for(int j=1; j<=10; j++) {
				int num = sc.nextInt();
				if(num%2 == 1) {
					sum += num;
				}
			}
			System.out.printf("#%d %d\n", i, sum);
		}
	}
}
