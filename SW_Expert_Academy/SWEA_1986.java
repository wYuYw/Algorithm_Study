// 1986. 지그재그 숫자

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
            int sum = 0;
			int N = Integer.parseInt(br.readLine());
            for(int i=1; i<=N; i++) {
            	if(i%2==0) {
                	sum -= i;
                }
                else {
                	sum += i;
                }
            }
            bw.write("#"+test_case+" "+sum);
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}
