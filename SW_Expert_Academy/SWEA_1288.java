// 1288. 새로운 불면증 치료법

// Solution01 by wYuYw

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
    
class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String N = br.readLine();
            int M = Integer.parseInt(N);
            boolean[] arr = new boolean[10];
            int cnt = 0;
            int num = 1;
            
            while(true) {
                for (int i = 0; i <N.length() ; i++) {
                    int temp = Integer.parseInt(N.substring(i, i+1));
            		if(arr[temp]==false) {
                    	arr[temp] = true;
                        cnt++;
                    }
       			}
                if(cnt==10) break;
                else {
                    num++;
                    N = Integer.toString(num*M);
                }
            }
            bw.write("#"+test_case+" "+N);
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}


// Solution02 by wYuYw - Use StringBuilder instead of BufferedWriter
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String N = br.readLine();
            int M = Integer.parseInt(N);
            boolean[] arr = new boolean[10];
            int cnt = 0;
            int num = 1;
            
            while(true) {
                for (int i = 0; i <N.length() ; i++) {
                    int temp = Integer.parseInt(N.substring(i, i+1));
            		if(arr[temp]==false) {
                    	arr[temp] = true;
                        cnt++;
                    }
       			}
                if(cnt==10) break;
                else {
                    num++;
                    N = Integer.toString(num*M);
                }
            }
            sb.append("#"+test_case+" "+N+"\n");
		}
        System.out.print(sb.toString());
	}
}
*/


// by SonMinji_220219
/*
import java.util.Scanner;

public class SWEA_D2_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String N = sc.next();
			boolean[] checkArr = new boolean[10];
			int cnt = 1;
			boolean check = true;
			while(check) {
				for(int i=0; i<N.length(); i++) {
					checkArr[N.charAt(i)-'0'] = true;
				}
				int n = Integer.parseInt(N);
				for(int i=0; i<10; i++) {
					if(!checkArr[i]) { 
						check = true;
						cnt++;
						n = n/(cnt-1)*cnt;
						N = Integer.toString(n);
						break;
					}
					check = false;
					N = Integer.toString(n);
				}
			}
			System.out.printf("#%d %s\n", tcNum, N);
		}
	}
}
*/
