// 3124. 최소 스패닝 트리

// by SonMinji - KRUSKAL 알고리즘 (간선 선택) _220412

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SWEA_D4_3124 {

	// 그룹의 대표 저장할 배열
	static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 (1 <= T <= 10)
		int T = sc.nextInt();
		for (int tcNum = 1; tcNum <= T; tcNum++) {
			// 정점 개수 (1 <= V <= 100,000)
			int V = sc.nextInt();
			// 정점이 속한 그룹의 대표 저장
			p = new int[V + 1];
			// MakeSet (i가 있는 그룹에는 현재 i 혼자이므로 대표를 i로 초기화)
			for (int i = 1; i <= V; i++) {
				p[i] = i;
			}
			// 간선 개수 (1 <= E <= 200,000)
			int E = sc.nextInt();
			// 간선 정보 저장할 배열
			int[][] edges = new int[E][3];
			for (int e = 0; e < E; e++) {
				// 정점 a(배열의 첫번째 열)와 정점 b(배열의 두번째 열)가 가중치 w(배열의 세번째 열)인 간선으로 연결
				edges[e][0] = sc.nextInt();
				edges[e][1] = sc.nextInt();
				// 여러 간선들 중 가중치 합이 최소가 되도록 하는 간선을 선택해줘야 하므로
				// 여기에서는 그룹을 합치지 않고 그냥 간선 정보만 배열에 입력함 주의!★
				// union(edges[e][0], edges[e][1]);
				// 가중치 (-1,000,000 <= w <= 1,000,000)
				edges[e][2] = sc.nextInt();
			}
			// 간선 가중치에 따라 오름차순으로 정렬
			Arrays.sort(edges, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[2] - o2[2];
				}
			});

			// MST 최소 비용 신장 트리
			// 간선 선택 개수
			int edgeCnt = 0;
			// 가중치 최솟값
			// 가중치와 간선 개수를 최대치로 곱하면 int범위 벗어나므로 long으로 받아야 함 주의!★
			long result = 0;
			for (int e = 0; e < E && edgeCnt != V - 1; e++) {
				// 간선 정보가 담긴 베열을 가중치를 기준으로 오름차순으로 정렬하였으므로
				// 배열의 작은 인덱스부터 값을 확인해서 해당 간선 선택할지 판별
				// 모든 정점을 연결해야 하므로 간선 선택 개수는 적어도 정점 개수 - 1개가 되어야 하고
				// 동시에 가중치는 최솟값이 되어야 하므로 제일 적은 개수의 간선을 선택해야하므로 정점 개수-1개만 선택함
				int a = edges[e][0];
				int b = edges[e][1];
				if (findSet(a) != findSet(b)) { // 두 정점의 부모가 같지 않을 경우
					// 두 정점이 속한 그룹을 합친다
					union(edges[e][0], edges[e][1]);
					// 해당 간선은 선택된 거니까 가중치 구하는 변수에 해당 간선의 가중치를 더해줌
					result += edges[e][2];
					// 해당 간선은 선택된 거니까 간선 선택 개수 하나 늘려줌
					edgeCnt++;
				}
			}

			// 결과 출력
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}

	// x가 속한 그룹의 대표 찾기
	public static int findSet(int x) {
		if (x != p[x]) { // 그룹의 대표가 내가 아닐 경우
			// 나와 연결된 정점을 타고타고 해서 결국 내가 속한 그룹의 대표를 찾을 수 있도록
			// FindSet을 재귀호출
			// FindSet을 행하는 과정에서 만나는 모든 정점들이 직접 root를 가리키도록 포인터를 바꾸어 줌
			p[x] = findSet(p[x]);
		}
		return p[x];
	}

	// a와 b의 그룹 합치기
	public static void union(int a, int b) {
		// a그룹 안에 b그룹를 넣는 방식
		// b그룹의 대표를 a그룹의 대표로 설정함
		p[findSet(b)] = findSet(a);
	}
}
