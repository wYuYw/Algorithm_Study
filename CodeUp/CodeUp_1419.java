// 1419 : love 2

// by SonMinji_220123

import java.util.Scanner;

public class CU1419 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextLint() 이용해서 문자 또는 문장 한라인 전체를 입력받음
		String str = sc.nextLine();
		int cnt = 0;
		for(int i=0; i<=str.length()-4; i++) {
			// 주의! 문자열 비교는 ==이 아니라 equals 사용
			if(str.substring(i, i+4).equals("love")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}


//Solution01 by wYuYw - Java
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		String key = "love";
		int cnt = 0;
		
		for(int i=0; i<word.length()-3; i++) {
			if(word.substring(i, i+4).equals(key)) cnt++;
		}
		bw.write(Integer.toString(cnt));
		bw.flush();
	}
}
*/


//Solution02 by wYuYw - Python
/*
N = input()
cnt = 0

cnt = N.count("love")

print(cnt)
*/
