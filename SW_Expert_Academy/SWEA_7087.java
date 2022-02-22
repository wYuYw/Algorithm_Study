// 7087. 문제 제목 붙이기

// Solution by wYuYw

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            boolean[] list = new boolean[26];
            for(int i = 0; i < n; i++) {
            	String title = sc.next();
            	list[title.charAt(0) - 'A'] = true;
            }
            
            int i;
            for(i = 0; i < 26; i++) {
            	if(!list[i]) break;
            }
            System.out.println("#" + test_case + " " + i);
		}
	}
}
