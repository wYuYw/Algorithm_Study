// 3985. 롤 케이크

// by SonMinji_220328

import java.util.Scanner;

public class BJ3985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 롤 케이크 길이 (1 <= L <= 1000)
		int L = sc.nextInt();
		// 방청객 수 (1 <= N <= 1000)
		int N = sc.nextInt();
		// 예상 조각 수
		int piece = 0;
		// 가장 많은 조각을 받을 것으로 기대하고 있던 방청객의 번호
		int n1 = 0;
		// 실제로 가장 많은 조각을 받은 방청객의 번호
		int n2 = 0;
		// 실제  조각 수
		int maxPiece = 0;
		// 롤케이크 배열
		int[] cake = new int[L+1];
		// N명의 사람 각각의 원하는 조각 번호(p1조각부터 p2조각) 입력
		for(int n=1; n<=N; n++) {
			int p1 = sc.nextInt();
			int p2= sc.nextInt();
			
			// 예상 조각 수 최대인 사람 찾기
			// 최대인 사람이 여러명이면 번호 작은 사람 출력
			if(piece < (p2-p1)) {
				piece = p2-p1;
				n1 = n;
			}
			
			// 실제로 받은 조각 개수 체크할 변수
			int cnt = 0;
			// 실제 조각 수 최대인 사람 찾기
			for(int i=p1; i<=p2; i++) {
				if(cake[i] == 0) { // 케이크를 받을 수 있는 경우
					cake[i] = n;
					cnt++;
				}
			}
			// 지금까지 받은 사람들 중 받은 조각 수가 제일 많으면 
			// 그 조각수(maxPiece)와 방청객 번호(n2) 기억하기
			if(maxPiece < cnt) {
				maxPiece = cnt;
				n2 = n;
			}
		}
		
		// 결과 출력
		// 가장 많은 조각을 받을 것으로 기대하고 있던 방청객의 번호
		System.out.println(n1);
		// 실제로 가장 많은 조각을 받은 방청객의 번호
		System.out.println(n2);
	}
}
