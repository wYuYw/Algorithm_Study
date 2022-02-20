// Baekjoon_10799 쇠막대기

// Solution by wYuYw

import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] pattern = sc.next().toCharArray();
		int bar = 0;
		int result = 0;
		for(int i = 0; i < pattern.length; i++) {
			char temp = pattern[i];
			if(temp == '(') bar += 1;
			else if(temp == ')') {
				if(pattern[i - 1] == '(') {
					bar -= 1;
					result += bar;
				} else {
					bar -= 1;
					result += 1;
				}
			}
		}
		System.out.println(result);
	}
}
