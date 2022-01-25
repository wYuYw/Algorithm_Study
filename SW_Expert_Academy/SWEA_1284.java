// 1284. 수도 요금 경쟁

// Solution by wYuYw

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
            
class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            
            if(W>R) {
                int A = W * P;
                int B = Q + (W - R) * S;
                bw.write("#"+test_case+" "+Math.min(A, B));
            }
            else {
                int A = W * P;
                int B = Q;
                bw.write("#"+test_case+" "+Math.min(A, B));
            }
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}
