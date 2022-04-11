// 7465. 창용 마을 무리의 개수

// by SonMinji_220411

import java.util.Scanner;

public class SWEA_D4_7465 {
	
	// 무리의 대표 저장할 배열
	static int[] p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			// 사람 수 (1 <= N <= 100)
			int N = sc.nextInt();
			// 인덱스에 해당하는 번호의 사람이 속해있는 무리의 대표를 
			// 해당 인덱스의 값으로 저장
			p = new int[N + 1];
			// MakeSet (내가 있는 무리에는 현재 나 혼자이므로 대표를 나로 초기화)
			for (int n = 1; n <= N; n++) {
				p[n] = n;
			}

			// 관계의 개수 (0 <= M <= N(N-1)/2)
			int M = sc.nextInt();
			for(int m=1; m<=M; m++) {
				// 관계를 갖는 두 사람의 무리를 합침
				Union(sc.nextInt(), sc.nextInt());
			}
			
			// 몇 개의 무리가 존재하는지 파악
			// 각 사람이 속한 무리의 대표를 체크할 배열
			boolean[] check = new boolean[N+1];
			for(int n=1; n<=N; n++) {
				check[FindSet(n)] = true;
			}
			// 체크된 대표의 수가 무리의 개수
			int cnt = 0;
			for(int n=1; n<=N; n++) {
				if(check[n]) {
					cnt++;
				}
			}
			
			// 결과 출력
			System.out.printf("#%d %d\n", tcNum, cnt);
		}
	}
	
	// x가 속한 무리의 대표 찾기
	public static int FindSet(int x) {
		if(x == p[x]) { // 무리의 대표가 나일 경우
			return x;
		} else { // 무리의 대표가 내가 아닐 경우
			// 나와 연결된 사람을 타고타고 해서 결국 내가 속한 무리의 대표를 찾을 수 있도록
			// FindSet을 재귀호출
			// 이때 넘기는 값이 p[x]임을 주의!! x 아님!
			return FindSet(p[x]);
			
			// 연산을 좀 더 효율적으로 하는 방법 (Path compression 사용)
			// FindSet을 행하는 과정에서 만나는 모든 노드들이 직접 root를 가리키도록 포인터를 바꾸어 줌
			// 재귀호출로 알게 된 현재 내가 속한 무리의 대표를 내 배열값으로 저장해두면
			// 처음만 나와 연결된 사람 타고타고 해서 대표 구하고
			// 그 다음부터는 내 배열값이 대표라서 대표 찾는 데 걸리는 시간이 줄어듬
//			return p[x] = FindSet(p[x]);
		}
	}
	
	// x와 y의 무리 합치기
	public static void Union(int x, int y) {
		// x무리 안에 y무리를 넣는 방식
		// y무리의 대표를 x무리의 대표로 설정함
		p[FindSet(y)] = p[FindSet(x)];
	}
	
}
