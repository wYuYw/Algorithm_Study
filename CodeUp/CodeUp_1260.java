// 1260 : 3의 배수의 합

// by SonMinji_220126

import java.util.Scanner;

public class CU1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;
    // 문제에서 a에서 b까지라고 해서 num2도 포함하여 for문 작성해야 함
		for(int i=num1; i<=num2; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
