// 7568. 덩치

// by SonMinji_220726

import java.util.Scanner;

public class BJ7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 전체 사람의 수
		int N = sc.nextInt();
		// 몸무게, 키, 덩치 등수 저장할 배열
		int[][] info = new int[N][3];
		// 사람들의 몸무게, 키 입력
		for(int n=0; n<N; n++) {
			// 몸무게 입력
			info[n][0] = sc.nextInt();
			// 키 입력
			info[n][1] = sc.nextInt();
			// 등수 1로 초기화
			info[n][2] = 1;
		}
		
		// 사람들 몸무게, 키 비교하여 등수 저장
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				
				if(info[i][0]>info[j][0] && info[i][1]>info[j][1]) {
				// i의 키와 몸무게가 j의 키와 몸무게보다 클 경우
					// i가 j보다 덩치가 더 큰 것으로 j의 등수는 하나 증가
					info[j][2]++;
				} else if(info[i][0]<info[j][0] && info[i][1]<info[j][1]) {
				// j의 키와 몸무게가 i의 키와 몸무게보다 클 경우
					// j가 i보다 덩치가 더 큰 것으로 i의 등수는 하나 증가
					info[i][2]++;
				}
			}
		}
		
		// 결과 출력 (입력순으로 덩치 등수 출력)
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(info[i][2]+" ");
		}
		System.out.println(sb);
	}
}
