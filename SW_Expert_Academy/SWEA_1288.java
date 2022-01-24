// 1288. 새로운 불면증 치료법

// Solution by wYuYw

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
