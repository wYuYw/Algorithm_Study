// 9012. 괄호

// by SonMinji_220518

import java.util.Scanner;
import java.util.Stack;

public class BJ9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		
		loop: for(int t=1; t<=T; t++) { // 각 테스트 케이스마다
			// 괄호 문자열 (2 <= str.length() <= 50)
			String str = sc.next();
			
			// 올바른 괄호 문자열인지 체크하기 위해 스택 사용
			// 스택은 Last In First Out
			Stack<Character> stack = new Stack<>();
			
			// 문자열에 '(' 나오면 스택에 담고 ')' 나오면 스택에서 '('를 하나 꺼냄
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == '(') { // '('인 경우
					stack.push('(');
				} else { // ')'인 경우
					if(stack.isEmpty()) { // stack이 비어있는 경우
						// ')' 이어서 스택에서 '('를 하나 꺼내야 하는데 스택이 비어있으므로
						// 괄호가 맞지 않는 문자열이므로 NO 출력
						System.out.println("NO");
						// 더 검사해볼 필요 없으니 다음 테스트 케이스 검사하러 가기
						continue loop;
					}
					// 스택에서 '(' 하나 꺼내기
					stack.pop();
				}
			}
			
			// 문자열의 길이만큼 스택에 담고 꺼내는 과정을 진행함
			// 올바른 괄호 문자열이라면 '('와  ')'의 개수가 동일하므로 스택이 비어있어야 함
			if(stack.isEmpty()) { // 스택이 비어있을 경우
				// 올바른 괄호 문자열이므로 YES 출력
				System.out.println("YES");				
			} else { // 스택이 비어있지 않은 경우
				// 입력된 문자열이 괄호가 맞지 않는 문자열이므로 NO 출력
				System.out.println("NO");
			}
		}
		
	}
}
