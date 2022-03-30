// 1248. [S/W 문제해결 응용] 3일차 - 공통조상

// by SonMinji_220330

import java.util.Scanner;

public class SWEA_D5_1248 {
	// 서브 트리 크기 셀 변수
	static int cnt;
	// 부모와 자식 정보 담을 배열
	static int[][] tree;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			// 트리의 정점의 총 수 V (10 ≤ V ≤ 10000)
			int V = sc.nextInt();
			// 간선의 총 수 E
			int E = sc.nextInt();
			// 공통 조상을 찾는 두 개의 정점 번호
			int sv1 = sc.nextInt();
			int sv2 = sc.nextInt();
			
			// 부모와 자식 정보 담을 배열
			// 0행 : 해당 인덱스의 왼쪽 자식 번호
			// 1행 : 해당 인덱스의 오른쪽 자식 번호
			// 2행 : 해당 인덱스의 부모 번호
			tree = new int[3][V+1];
			// E개 간선 입력 (간선을 이루는 두 정점으로 항상 부모 자식 순서로 입력)
			for(int e=1; e<=E; e++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();
				// 배열에서 부모의 번호열에 해당하는 0번째 행(왼쪽 자식 번호 저장하는 공간)에 자식 번호 입력
				// 만약 0번째 행에 이미 다른 자식 번호가 입력되어 있다면 1번째 행(오른쪽 자식 번호 저장하는 공간)에 자식 번호 입력
				if(tree[0][parent] == 0) {
					tree[0][parent] = child;
				} else {
					tree[1][parent] = child;
				}
				// 자식의 번호열에 해당하는 2번째 행(부모 번호 저장하는 공간)에 부모 번호 입력
				tree[2][child] = parent;
			}
			
			
			// 두 정점의 가장 가까운 공통 조상 찾기
			// 루트 노드 번호가 1이므로 루트 노드(1열)까지만 검사 (0열은 검사X)
			// sv1 == 1일 때도 tree[2][sv1] = -1을 해줘야 공통 조상이 루트 노드만 있는 경우도 공통 조상을 찾을 수 있음
			while(sv1 >= 1) {
				// 현재 노드의 부모가 누군지 기억하기
				int parent = tree[2][sv1];
				// tree 배열에서 사용하지 않은 숫자인 -1을 입력하여 
				// 해당 열 번호가 입력받은 sv1의 조상임을 표시 (sv1열의 2행 값도 -1로 표시됨)
				tree[2][sv1] = -1;
				// sv1을 sv1의 부모값으로 바꾸어 조상들을 계속 찾아나갈 수 있게 함
				sv1 = parent;
			}
			// sv2의 조상을 찾아가다가 -1이 나오면 그 열 번호가 공통 조상임
			while(tree[2][sv2] != -1) {
				sv2 = tree[2][sv2];
			}
			// sv2가 공통 조상 번호로 바뀌고 위 while문에서 조건에 걸려서 빠져나오므로 sv2가 공통 조상의 번호임
			
			
			// 찾은 공통 조상을 루트로 하는 서브 트리의 크기 파악하기
			// 서브 트리 크기 셀 변수 0으로 초기화
			cnt = 0;
			// 중위 순회하며 노드 개수 파악하는 메서드 실행
			LVR(sv2);
			
			
			// 결과 출력
			System.out.printf("#%d %d %d\n", tcNum, sv2, cnt);
		}
	}
	
	// 중위 순회하면서 트리 크기 파악할 메서드
	public static void LVR (int idx) {
		if(idx == 0) { // 자식이 없는 경우(배열 값이 0이면 자식이 없다는 것) 메서드 빠져나가기
			return;
		}
		
		// 번호 idx인 노드의 왼쪽 자식 체크
		LVR(tree[0][idx]);
		// 번호 idx인 노드 카운트
		cnt++;
		// 번호 idx인 노드의 오른쪽 자식 체크
		LVR(tree[1][idx]);
	}
}
