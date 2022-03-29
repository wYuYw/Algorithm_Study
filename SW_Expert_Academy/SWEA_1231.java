// 1231. [S/W 문제해결 기본] 9일차 - 중위순회

// by SonMinji_220329

import java.util.Scanner;

public class SWEA_D4_1231 {
	// 입력된 알파벳 저장할 배열
	static String[] arr;
	// 순서대로 알파벳 출력하여 저장할 변수
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tcNum=1; tcNum<=10; tcNum++) { // 10개의 테스트 케이스
			// 노드 개수 (1 <= N <= 100)
			int N = sc.nextInt();
			// 노드 저장할 배열
			arr = new String[N+1];
			for(int n=1; n<=N; n++) {
				// 정점 번호
				int idx = sc.nextInt();
				// 해당 번호에 들어갈 알파벳 입력받고 그걸 해당 인덱스의 배열에 저장
				arr[idx] = sc.next();
				// 입력 받은 정점의 자식을 입력받음 (필요없어서 입력만 받고 사용하진 않음)
				// N(마지막 정점 번호)/2는 부모 번호를 의미함
				if(N/2 > idx) { // 마지막 원소의 부모 번호보다 작은 번호이므로 자식이 둘 다 있는 경우 (문제에서 완전이진트리라고 함)
					sc.nextInt();
					sc.nextInt();
				} else if(N/2 == idx) { // 마지막 원소의 부모 번호일 경우
					// 우선 자식이 무조건 하나는 있으니 하나(왼쪽 자식 번호) 입력받고
					sc.nextInt();
					if(idx*2+1 == N) { // 오른쪽 자식 번호가 N과 같다면 오른쪽 자식도 있다는 것이므로 
						// 하나 더(오른쪽 자식 번호) 입려 받음
						sc.nextInt();
					}
				}
			}
			
			// 중위 순회 순으로 알파벳 읽기
			// 알파벳 저장할 변수
			sb = new StringBuilder();
			// 중위 순회 순으로 트리 읽게 만든 메서드 호출
			// 루트 노드부터 시작하므로 1을 넣어줌
			LVR(1);
			
			// 결과 출력
			System.out.printf("#%d %s\n", tcNum, sb);
		}
	}
	
	// 중위 순회 메서드
	public static void LVR (int idx) {
		if(idx >= arr.length) {
			// 체크 해야할 노드가 존재하지 않으면 메서드 빠져나감
			// 즉, 리프 노드의 자식이 있는지 체크하러 들어오는데 존재하지 않으므로 메서드 빠져나가는 것
			return;
		}
		
		// 모든 노드를 다 돌면서 자식 체크
		// L 왼쪽 자식 체크
		LVR(idx*2);
		// V 본인 출력
		sb.append(arr[idx]);
		// R 오른쪽 자식 체크
		LVR(idx*2+1);
	}
}
