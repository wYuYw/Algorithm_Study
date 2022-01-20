// 1492 : [기초-배열연습] 1차원 누적 합 배열 만들기 5-1

// by SonMinji
import java.util.Scanner;

public class CU1492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		int sum = 0;
		for(int e : arr) {
			sum += e;
			System.out.printf("%d ", sum);
		}
	}
}
