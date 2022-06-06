// 4949. 균형잡힌 세상

// by SonMinji_220606

import java.util.Scanner;
import java.util.Stack;

public class BJ4949 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 문자열 종료 조건 입력되기 전까지 계속 입력 받기
		loop: while(true) {
			// 입력된 문자열
			String str = sc.nextLine();
			
			// 점 하나(".")만 들어올 경우 입력 종료
			if(str.equals(".")) {
				break;
			}
			
			// 그 외 경우
			// 괄호 균형 체크 시 사용할 스택
			Stack<Character> stack = new Stack<>();
			// 입력된 문자열의 문자 하나하나 체크		
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == '(' || str.charAt(i) == '[') { // 열린 괄호인 경우
					// 스택에 추가
					stack.add(str.charAt(i));
				} else if(str.charAt(i) == ')') { // 닫힌 소괄호인 경우
					if(!stack.isEmpty() && stack.peek() == '(') { 
					// 스택 최상단에 해당 괄호와 짝이 맞는 열린 괄호가 있는 경우
						// 해당 열린 괄호 스택에서 제거
						stack.pop();
					} else { // 그 외 경우 (괄호가 균형이 안맞는 경우)
						// no 출력
						System.out.println("no");
						// 이번 문자열은 더이상 검사할 필요 없으므로 loop 이름 달아놓은 반복문부터 다시 실행
						continue loop;
					}
				} else if(str.charAt(i) == ']') { // 닫힌 대괄호인 경우
					if(!stack.isEmpty() && stack.peek() == '[') {
					// 스택 최상단에 해당 괄호와 짝이 맞는 열린 괄호가 있는 경우
						// 해당 열린 괄호 스택에서 제거
						stack.pop();
					} else { // 그 외 경우 (괄호가 균형이 안맞는 경우)
						// no 출력
						System.out.println("no");
						// 이번 문자열은 더이상 검사할 필요 없으므로 loop 이름 달아놓은 반복문부터 다시 실행
						continue loop;
					}
				}
			}
			
			// 결과 출력
			// 열린 괄호만 들어온 경우도 있을 수 있으므로
			// stack이 비어있는지 확인하여 출력하는 결과를 달리 해야 함
			if(stack.isEmpty()) { // 스택이 비어있는 경우 (괄호의 균형이 맞는 경우)
				System.out.println("yes");				
			} else { // 스택이 비어있지 않는 경우 (괄호의 균형이 안맞는 경우)
				System.out.println("no");
			}
		}
	}
}
