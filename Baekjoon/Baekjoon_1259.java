// 1259. 팰린드롬수

// by SonMinji_220623

import java.util.Scanner;

public class BJ1259 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 입력받은 정수를 저장할 변수 (1 <= num <= 99999)
		// 뒤집은 수랑 비교해야 하므로 String으로 저장
		String num;
		// 입력받은 문자열을 뒤집어 저장할 변수
		String reverseNum;
    
		while(true) {
			// 정수 입력
			num = sc.next();
			// 입력 종료 조건
			if(num.equals("0")) { // 0이 입력되면
				// 입력 종료. 더이상 검사 진행할 필요 없음
				break;
			}
			
			// 입력받은 문자열을 뒤집어 저장할 변수 초기화
			reverseNum = "";
			// 입력받은 문자의 마지막 글자부터 첫글자까지 변수에 저장
			for(int i=num.length()-1; i>=0; i--) {
				reverseNum += num.charAt(i);
			}
			
			// 결과 출력
			if(Integer.parseInt(num)-Integer.parseInt(reverseNum) == 0) {
			// 입력받은 정수와 해당 정수를 뒤집은 정수를 뺀 값이 0이면
				// 두 수가 같다는 것이니까 즉, 팰린드롬수라는 거니까 yes 출력
				System.out.println("yes");
			} else { // 입력받은 정수와 해당 정수를 뒤집은 정수를 뺀 값이 0이 아니라면
				// 두 수가 다르다는 거니까 즉, 팰린드롬수가 아니라는 거니까 no 출력
				System.out.println("no");				
			}
		}
		
	}
}
