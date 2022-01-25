// 1989. 초심자의 회문 검사

// Solution01 by wYuYw - StringBuilder.reverse() 사용

import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringBuilder word = new StringBuilder(br.readLine());
            if(word.toString().equals(word.reverse().toString()))
            	bw.write("#"+test_case+" "+1);
            else
                bw.write("#"+test_case+" "+0);
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}


// Solution02 by wYuYw - for문 사용
/*
import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String word = br.readLine();
            String reversedWord = "";
            for(int i=word.length()-1; i>=0; i--) {
            	reversedWord += word.charAt(i);
            }
            if(word.equals(reversedWord))
            	bw.write("#"+test_case+" "+1);
            else
                bw.write("#"+test_case+" "+0);
            bw.newLine();
            bw.flush();
		}
        bw.close();
	}
}
*/
