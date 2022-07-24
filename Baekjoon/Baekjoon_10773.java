// 10773. 제로

// by SonMinji_220724

import java.util.Scanner;
import java.util.Stack;

public class BJ10773 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 정수 개수 (1 <= K <= 100,000)
		int K = sc.nextInt();
		// 더할 수 저장할 스택
		Stack<Integer> stack = new Stack<>();
		// 입력되는 수
		int num;
		// 더할 수 입력
		for(int k=0; k<K; k++) {
			// 더할 수
			num = sc.nextInt();
			if(num != 0) { // 입력된 수가 0이 아닐 경우
				// stack에 추가
				stack.add(num);
			} else { // 입력된 수가 0일 경우
				// 최근에 적은 수를 지움
				// 문제에서 입력된 수가 0일 경우에 지울 수 있는 수가 있음을 보장힌디거 헸으므로 iseEmpty 해볼 필요는 없음
				stack.pop();
			}
		}
		
		// 적힌 수의 합
		int sum = 0;
		// stack에 저장된 수들의 합 구하기
		while(!stack.isEmpty()) {
			// stack에서 값 하나씩 빼가며 더하기
			sum += stack.pop();
		}
		
		// 결과 출력
		System.out.println(sum);
	}
}
