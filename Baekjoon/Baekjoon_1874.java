// 1874. 스택 수열

// by SonMinji_220803

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// 숫자 개수 (1 <= n <= 100,000)
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		// 필요한 연산 혹은 연산 불가능 시 NO 저장
		StringBuilder sb = new StringBuilder();
		
		// 입력되는 1이상 n이하의 정수
		int num;
		// 스택에 넣을 정수
		int pushNum = 1;
		// 필요한 연산 찾는 과정을 n번만큼 반복
		for(int i=1; i<=n; i++) {
			// 입력된 수열을 이루는 정수
			num = sc.nextInt();
			while(stack.isEmpty() || num-stack.peek() > 0) {
			// 스택이 비었거나, 입력된 정수와 스택 마지막에 넣은 값 차이가 0보다 크면
				// 숫자를 더 넣을 수 있으므로 stack에 정수 순서대로 추가 
				stack.push(pushNum);
				// push 사용했으니 출력문에 + 추가 
				sb.append("+\n");
				// stack에 넣을 숫자 하나 증가
				pushNum++;
			}
			if(num-stack.peek() == 0) { // 입력된 정수와 스택 마지막에 넣은 값 차이가 0이면
				// 입력된 수열을 만들기 위해 pop
				stack.pop();
				// pop 사용했으니까 출력문에 - 추가
				sb.append("-\n");
			} else if(num-stack.peek() < 0) { // 입력된 정수와 스택 마지막에 넣은 값 차이가 0보다 작으면
				// 만들 수 없는 수열이므로
				// 지금까지 사용한 연산을 다 지우고
				sb.delete(0, sb.length());
				// NO를 출력문에 추가
				sb.append("NO");
				break;
			}
		}
		
		// 결과 출력 (필요한 연산 혹은 연산 불가능 시 NO)
		System.out.println(sb);
	}
}
