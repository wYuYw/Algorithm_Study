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



// by SonMinji_220301
/*
import java.util.Scanner;

public class SWEA_D3_7087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			boolean[] check = new boolean[26];
			for(int i=0; i<N; i++) {
				check[sc.next().charAt(0)-'A'] = true;
			}

			int cnt = 0;
			for(int i=0; i<26; i++) {
				if(!check[i]) {
					break;
				}
				cnt++;
			}
			
			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
}
*/
