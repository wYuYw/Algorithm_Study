// 1945. 간단한 소인수분해

// Solution by wYuYw

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Solution
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            
            while(N%2==0) {
                N /= 2;
                a++;
            }
            while(N%3==0) {
                N /= 3;
                b++;
            }
            while(N%5==0) {
                N /= 5;
                c++;
            }
            while(N%7==0) {
                N /= 7;
                d++;
            }
            while(N%11==0) {
                N /= 11;
                e++;
            }
            bw.write("#"+test_case+" "+a+" "+b+" "+c+" "+d+" "+e);
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}



// by SonMinji_220219
/*
import java.util.Scanner;

public class SWEA_D2_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			while(N != 1) {
				int cnt = 0;
				while(N % 2 == 0) {
					N = N/2;
					cnt++;
				}
				sb.append(" "+cnt);
				cnt = 0;
				while(N % 3 == 0) {
					N = N/3;
					cnt++;
				}	
				sb.append(" "+cnt);
				cnt = 0;
				while(N % 5 == 0) {
					N = N/5;
					cnt++;
				}
				sb.append(" "+cnt);
				cnt = 0;
				while(N % 7 == 0) {
					N = N/7;
					cnt++;
				}
				sb.append(" "+cnt);
				cnt = 0;
				while(N % 11 == 0) {
					N = N/11;
					cnt++;
				}
				sb.append(" "+cnt);
			}
			
			String result = sb.toString();
			System.out.printf("#%d%s\n", tcNum, result);
		}
	}
}

*/
