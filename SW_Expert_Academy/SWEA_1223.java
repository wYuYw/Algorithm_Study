// 1223. [S/W 문제해결 기본] 6일차 - 계산기2

// by SonMinji_220217

import java.util.Scanner;
import java.util.Stack;

public class SWEA_D4_1223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int length = sc.nextInt();
			String str = sc.next();
			char[] arr = str.toCharArray();
			char[] changeArr = new char[length];
			Stack<Character> stack = new Stack<>();
			
			int changeIdx = 0;
			for(int i=0; i<length; i++) {
				if(arr[i]>=48 && arr[i]<=57) {
					changeArr[changeIdx] = arr[i];
					changeIdx++;
				} else {
					if(stack.isEmpty()) {
						stack.push(arr[i]);						
					} else {
						if(arr[i] == '+') {
							while(!stack.isEmpty()) {
								changeArr[changeIdx] = stack.pop();
								changeIdx++;								
							}
							stack.push(arr[i]);
						} else { 
							while(!stack.isEmpty() && stack.peek() == '*') {
								changeArr[changeIdx] = stack.pop();
								changeIdx++;				
							}
							stack.push(arr[i]);
						}
					}
				}
			}
			while(!stack.isEmpty()) {
				changeArr[changeIdx] = stack.pop();
				changeIdx++;	
			}	

			Stack<Integer> calStack = new Stack<>();
			for(int i=0; i<length; i++) {
				if(changeArr[i]>='0' && changeArr[i]<='9') {
					calStack.push(changeArr[i]-'0');
				} else {
					int b = calStack.pop();
					int a = calStack.pop();
					int result = 0;
					if(changeArr[i]=='+') {
						result = a+b;
						calStack.push(result);
					} else {
						result = a*b;
						calStack.push(result);
					}
				}
			}
			System.out.printf("#%d %d\n", tcNum, calStack.pop());
		}
	}
}
