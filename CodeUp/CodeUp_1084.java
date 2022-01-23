// 1084 : [기초-종합] 빛 섞어 색 만들기(설명)

// by SonMinji_220123

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CU1084 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();

		// System.out.print() 이거는 처리 속도가 느릭 출력 함수라서
		// 자바 출력 함수 중 가장 빠른 BufferedWriter 이용하여 출력해야함
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<g; j++) {
				String str = "";
				for(int k=0; k<b; k++) {
					str += i+" "+j+" "+k+"\n";
					cnt++;
				}
				// 아래 두줄 에러 안나게 하기 위해서 예외처리 해줘야 함
				// main메서드에서 throws IOException 해줌
				bf.write(str); // 버퍼에 있는 값 전부 출력
				bf.flush(); // 남아있는 데이터를 모두 출력시킴
			}
		}
		System.out.println(cnt);
		// 버퍼에 적고 출력하는 걸 끝내는 게 아니라 System.out을 끝낸다는 의미인가 보다
		// 그래서 cnt를 버퍼를 이용해 출력하지 않아도 cnt를 출력하고 close해야 cnt까지 출력됨
		bf.close();
	}
}


//Solution by wYuYw - BufferedReader & BufferedWriter
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
		String[] color = br.readLine().split(" ");
		
		int num = 0;
		for(int i=0; i<Integer.valueOf(color[0]); i++) {
			for(int j=0; j<Integer.valueOf(color[1]); j++) {
				for(int k=0; k<Integer.valueOf(color[2]); k++) {
					bw.write(i + " " + j + " " + k + "\n");
					num++;
				}
			}
		}
		bw.write(String.valueOf(num));
		bw.flush();
	}
}
*/
