// 1224. [S/W 문제해결 기본] 6일차 - 계산기3

// by SonMinji_220217

import java.util.Scanner;
import java.util.Stack;

public class SWEA_D4_1224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int length = sc.nextInt();
			String str = sc.next();
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			
			for(int i=0; i<length; i++) {
				if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					sb.append(str.charAt(i));
				} else {
					if(stack.isEmpty()) {
						stack.push(str.charAt(i));
					} else if(str.charAt(i)=='+') { 
						while(!stack.isEmpty()) {
							if(stack.peek()=='(') {
								break;
							}
							sb.append(stack.pop());
						}
						stack.push(str.charAt(i));
					} else if(str.charAt(i)=='*') {
						while(!stack.isEmpty() && stack.peek()=='*') {
							if(stack.peek()=='(') {
								break;
							}
							sb.append(stack.pop());
						}
						stack.push(str.charAt(i));
					} else if(str.charAt(i)=='(') {
						stack.push(str.charAt(i));
					} else if(str.charAt(i)==')') {
						while(!(stack.peek()=='(')) {
							sb.append(stack.pop());
						}
						stack.pop();
					}
				}
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			String changeStr = sb.toString();
			
			Stack<Integer> calStack = new Stack<>();
			for(int i=0; i<changeStr.length(); i++) {
				if(changeStr.charAt(i)>='0' && changeStr.charAt(i)<='9') {
					calStack.push(changeStr.charAt(i)-'0');
				} else {
					int num2 = calStack.pop();
					int num1 = calStack.pop();
					int result = 0;
					if(changeStr.charAt(i)=='+') {
						result = num1 + num2;
						calStack.push(result);
					} else {
						result = num1 * num2;
						calStack.push(result);
					}
				}
			}
			System.out.printf("#%d %d\n", tcNum, calStack.pop());
		}
	}
}
