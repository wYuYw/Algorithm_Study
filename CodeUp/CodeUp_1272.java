// 1272 : 기부

// by SonMinji_220206

import java.util.Scanner;

public class CU1272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 번호가 홀수면  기부금 : (번호/2) + (번호%2)
		// 이 관점에서 보면 이것도 가능  번호가 짝수면 기부금 : ( ((번호-1)/2) + ((번호-1)%2) ) * 10
		// 번호가 짝수면  기부금 : 번호 * 5 
		// 이 관점에서 보면 이것도 가능  번호가 홀수면 기부금 : ((번호+1)*5)/10
		// 위 네가지 방법 중 간단한 방법으로 채택
		
		int money = 0;
		for(int i=0; i<=1; i++) {
			int number = sc.nextInt();
			if(number % 2 == 1) {
				money += (number/2) + (number%2);
			} else {
				money += number * 5;
			}
		}
		System.out.println(money);
	}
}
