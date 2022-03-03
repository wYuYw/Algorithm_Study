// 1218. [S/W 문제해결 기본] 4일차 - 괄호 짝짓기

// by SonMinji_220303

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tcNum=1; tcNum<=10; tcNum++) {
			int N = sc.nextInt();
			String str = sc.next();
			Stack<Character> stack = new Stack<>();
			Map<Character, Character> map = new HashMap<>();
			map.put(')', '(');
			map.put(']', '[');
			map.put('}', '{');
			map.put('>', '<');
			
			int result = 1;
			for(int i=0; i<N; i++) {
				if(")]}>".contains(str.substring(i,i+1))) {
					if(map.get(str.charAt(i))==stack.peek()) {
						stack.pop();
					} else {
						result = 0;
						break;
					}
				} else {
					stack.push(str.charAt(i));
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}
}
