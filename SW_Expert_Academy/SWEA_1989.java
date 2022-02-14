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



// Solution01 by SonMinji_220214 - for문 사용하여 변수에 저장하여 검사
/*
import java.util.Scanner;

public class SWEA_D2_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String str = sc.next();
			String reverseStr = "";
			int result = 0;
			for(int i=str.length()-1; i>=0; i--) {
				reverseStr += str.charAt(i);
			}
			//System.out.println(reverseStr);
			if(str.equals(reverseStr)) {
				result = 1;
			}
			System.out.printf("#%d %d\n", tcNum, result);
		}

	}
}
*/


// Solution02 by SonMinji_220214 - for문 사용하며 charAt(idx)로 바로 검사
/*
import java.util.Scanner;

public class SWEA_D2_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {

			String str = sc.next();
			int result = 1;
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i)) {
					result = 0;
					break;
				}
			}
			System.out.printf("#%d %d\n", tcNum, result);
		}
		
	}
}
*/
