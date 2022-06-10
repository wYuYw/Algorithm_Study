// 4153. 직각삼각형

// by SonMinji_220610

import java.util.Scanner;

public class BJ4153 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 세 변의 길이 (30,000보다 작은 양의 정수)
		int a, b, c;
		
		// 종료 조건 나올 때까지 반복
		while(true) {
			// 세 변의 길이 입력받기
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			// 0 0 0 입력 시 종료
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			// 결과 출력
			// 세 변의 길이가 주어졌으므로 직각삼각형인지 체크해야 하는 경우는 아래와 같이 3가지 ★
			if(a*a+b*b == c*c) {
				System.out.println("right");
			} else if(b*b+c*c == a*a) {
				System.out.println("right");
			} else if(c*c+a*a == b*b) {
				System.out.println("right");				
			} else {
				System.out.println("wrong");				
			}
		}
    
	}
}
