// 1197. 최소 스패닝 트리

// by SonMinji_220425 - Prim's Algorithm

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1197 {
	
	// 간선 정보 저장할 클래스 생성
	static class Edge implements Comparable<Edge> {
		// 시작 정점 번호
		int st;
		// 끝 정점 번호
		int ed;
		// st와 ed 잇는 간선의 가중치
		int w;
		
		public Edge(int st, int ed, int w) {
			this.st = st;
			this.ed = ed;
			this.w = w;
		}
		
		// 우선 순위 큐에 입력시 가중치를 기준으로 오름차순으로 정렬되도록 정렬 기준 설정
		@Override
		public int compareTo(Edge o) {
			return this.w - o.w;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정점 개수 (1 <= V <= 10,000)
		int V = sc.nextInt();
		// 간선 개수 (1 <= E <= 100,000)
		int E = sc.nextInt();
		// 간선 정보 저장할 리스트 배열
		List<Edge>[] adjList = new ArrayList[V+1];
		// 초기화
		for(int i=0; i<V+1; i++) {
			adjList[i] = new ArrayList<>();
		}
		// 간선 정보 저장
		for(int e=1; e<=E; e++) {
			// 시작 정점 번호
			int st = sc.nextInt();
			// 끝 정점 번호
			int ed = sc.nextInt();
			// 가중치 (w <= |1,000,000|)
			int w = sc.nextInt();
			
			// 무향 그래프
			adjList[st].add(new Edge(st, ed, w));
			adjList[ed].add(new Edge(ed, st, w));
		}
		
		// 가중치가 작은 순으로 선택할 간선 고려하기 위해 우선순위 큐 사용
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		// 방문 처리 배열
		boolean[] visited = new boolean[V+1];
		
		// 모든 정점 연결해야 하므로 1번 정점부터 시작
		// 방문한 정점 개수
		int cnt = 1;
		// 1번 정점 방문 처리
		visited[1] = true;
		// 1번 정점과 연결되어 있는 정점 번호 pq에 입력
		pq.addAll(adjList[1]);
		
		// 최소 스패닝 트리의 가중치
		int minW = 0;
		
		// 모든 정점 방문하면 종료 (프림)
		while(cnt != V) {
			// 가중치 작은 간선 정보
			Edge e = pq.poll();
			if(visited[e.ed]) { // 이미 방문한 정점일 경우
				continue;
			}
			// 방문하지 않은 정점일 경우
			// 방문 도시 개수 하나 증가
			cnt++;
			// 해당 정점 방문 처리
			visited[e.ed] = true;
			// 가중치에 추가
			minW += e.w;
			// 해당 정점과 연결되어 있는 정점 번호 pq에 입력
			pq.addAll(adjList[e.ed]);
		}
			
		// 결과 출력
		System.out.println(minW);
	}
}



// by SonMinji_220509 - Kruskal's Algorithm
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ1197re {
	
	// 각 정점이 속한 그룹의 대표를 저장할 배열
	static int[] parent;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정점의 개수 (1 <= V <= 10,000)
		// 정점은 1번부터 V번까지 
		int V = sc.nextInt();
		// 간선의 개수 (1 <= E <= 100,000)
		int E = sc.nextInt();
		// 간선 정보 저장할 배열
		int[][] edges = new int[E][3];
		// 배열에 간선 정보 입력
		for(int e=0; e<E; e++) {
			// 0번째 열, 1번째 열 : 연결될 두 정점 번호
			edges[e][0] = sc.nextInt();
			edges[e][1] = sc.nextInt();
			// 2번째 열 : 두 정점 연결하는 간선의 가중치
			edges[e][2] = sc.nextInt();
		}
		// 가중치 기준으로 오름차순으로 정렬
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2]-o2[2];
			}
		});
		
		// 각 정점이 속한 그룹의 대표를 저장할 배열
		parent = new int[V+1];		
		// 초기화 (makeSet)
		for(int v=1; v<V+1; v++) {
			// 처음엔 자기자신이 대표
			parent[v] = v;
		}
		
		// 선택한 간선 개수
		int select = 0;
		// 최소 스패닝 트리의 가중치
		int w = 0;
		
		// 간선 배열이 가중치 기준으로 오름차순으로 정렬되어있으니
		// 첫 행부터 간선 정보를 체크하여 간선을 선택하거나 선택하지 않음
		for(int e=0; e<E; e++) {
			// 연결될 수 있는 두 개의 정점이 속한 각 그룹의 대표 찾음
			int px = findSet(edges[e][0]);
			int py = findSet(edges[e][1]);
			
			// 연결할 두 정점이 속한 그룹의 대표가 다를 경우
			// (대표가 같으면 이미 두 정점은 연결되어 있는 것이므로 연결할 필요가 없음)
			if(px != py) {
				// 두 정점이 속한 그룹의 대표를 연결하여 두 정점이 같은 그룹에 있게 함
				union(px, py);
				// 선택한 간선의 개수 하나 증가
				select++;
				// 간선 하나 선택했으니 가중치 추가
				w += edges[e][2];
			}
			
			// 정점이 V개이므로 V-1개의 간선을 선택하면 모든 정점이 연결된 것이므로 반복문 종료
			if(select == V-1) {
				break;
			}
		}
		
		// 결과 출력
		System.out.println(w);
	}
	
	// x가 속한 그룹의 대표 찾기
	public static int findSet(int x) {
		if(parent[x] != x) {  // x가 속한 그룹의 대표가 x가 아닐 경우
			// 재귀호출을 통하여 x가 속한 그룹의 대표를 찾아서 대표 저장 배열에 저장함 
			parent[x] = findSet(parent[x]);
		}
		return parent[x];
	}
	
	// x가 속한 그룹과 y가 속한 그룹 합치기
	public static void union(int x, int y) {
		// main 메서드에서 union 메서드 사용 시 각 정점이 속한 그룹의 대표 번호를 넘겨주므로 
		// 그냥 y의 대표를 x로 저장해주면 두 그룹은 연결된 것
		parent[y] = x;
	}
	
}
*/
