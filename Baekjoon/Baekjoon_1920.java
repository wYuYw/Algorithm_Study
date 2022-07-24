// 1920. 수 찾기

// by SonMinji_220724

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ1920 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		
		// 정수 개수 (1 <= N <= 100,000)
		int N = sc.nextInt();
		// N개의 정수 값 저장할 셋
		Set<Integer> set = new HashSet<>();
		// 셋에 정수 값 입력
		for(int n=0; n<N; n++) {
			set.add(sc.nextInt());
		}
		
		// 정수 개수 (1 <= M <= 100,000)
		int M = sc.nextInt();
		// M개의 정수 값 저장할 배열
		int[] arr = new int[M];
		// 배열에 정수 값 입력
		for(int m=0; m<M; m++) {
			arr[m] = sc.nextInt();
		}
		
		// 출력 결과 저장할 StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// set에 arr의 정수들이 존재하는지 체크
		for(int i=0; i<M; i++) {
			if(set.contains(arr[i])) { // set에 arr에 저장된 정수가 존재하면
				// 1 출력
				sb.append(1+"\n");
			} else { // set에 arr에 저장된 정수가 존재하지 않으면 
				// 0 출력
				sb.append(0+"\n");
			}
		}
		
		// 결과 출력
		System.out.println(sb);
	}
}
