// 1409 : 기억력 테스트 1

// by SonMinji_220123

import java.util.Scanner;

public class CU1409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(arr[k-1]);
	}
}


//Solution by wYuYw
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
		String[] nums = br.readLine().split(" ");
		int k = Integer.parseInt(br.readLine());
		
		bw.write(nums[k-1]);
		bw.flush();
	}
}
*/
