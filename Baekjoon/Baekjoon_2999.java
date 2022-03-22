// Baekjoon_2999. 비밀 이메일

// by SonMinji_220322

import java.util.Scanner;
import java.util.Stack;

public class BJ2999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int N = str.length();
		Stack<Integer> stack = new Stack<>();
		for(int i=1; i<=N; i++) {
			if(N%i == 0) {
				if(i <= N/i) {
					stack.add(i);					
				} else {
					break;
				}
			}
		}
		int R = stack.pop();
		int C = N/R;
		int idx = 0;
		char[][] strArr = new char[R][C];
		for(int c=0; c<C; c++) {
			for(int r=0; r<R; r++) {
				strArr[r][c] = str.charAt(idx++);
			}
		}
		
		for(int r=0; r<R; r++) {
			for(int c=0; c<C; c++) {
				System.out.print(strArr[r][c]);
			}
		}
		
	}
}
