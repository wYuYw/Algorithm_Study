// 1922. 네트워크 연결

// by SonMinji_220502 - Prim's Algorithm

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1922 {
	
	// 간선 정보 담은 클래스
	static class Edge implements Comparable<Edge>{
		// 시작 컴퓨터 번호
		int st;
		// 끝 컴퓨터 번호
		int ed;
		// 두 컴퓨터 연결하는 데 드는 비용
		int cost;
		
		// 생성자
		public Edge(int st, int ed, int cost) {
			this.st = st;
			this.ed = ed;
			this.cost = cost;
		}
		
		// 우선순위 큐에 비용을 기준으로 오름차순으로 정렬되게 하기
		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 컴퓨터 개수 (1 <= N <= 1000)
		int N = sc.nextInt();
		// 연결할 수 있는 선의 수 (1 <= M <= 100,000)
		int M = sc.nextInt();
		// 간선 정보 저장할 리스트 배열
		List<Edge>[] adjList = new ArrayList[N+1];
		// 초기화
		for(int i=0; i<N+1; i++) {
			adjList[i] = new ArrayList<>();
		}
		// 간선 정보 
		for(int m=1; m<=M; m++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int cost = sc.nextInt();
			
			// 무향 그래프
			adjList[st].add(new Edge(st, ed, cost));
			adjList[ed].add(new Edge(ed, st, cost));
		}
		
		// 비용이 적게 드는 간선부터 체크하기 위해 우선순위 큐 사용
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		// 체크한 컴퓨터 표시해 놓을 배열
		boolean[] checked = new boolean[N+1];
		// 체크한 컴퓨터 개수
		int cnt = 0;
		// 모든 컴퓨터 연결하는 데 드는 최소 비용
		int minCost = 0;
		
		// 어차피 다 연결되어야 하니까 1번 컴퓨터부터 체크하자
		// 1번 컴퓨터와 연결된 간선들 정보를 우선순위 큐에 넣기
		pq.addAll(adjList[1]);
		// 체크한 컴퓨터 배열에 표시
		checked[1] = true;
		// 체크한 컴퓨터 개수 하나 증가
		cnt++;
		
		while(cnt != N) { // 모든 컴퓨터 체크하면 반복문 종료
			// 큐에 있는 간선들 중 비용이 제일 작은 간선 꺼내짐
			Edge curr = pq.poll();
			
			// 체크한 적 있는 컴퓨터인 경우
			if(checked[curr.ed]) {
				// 다음으로 비용 작은 간선 체크할 수 있도록 continue하여 반복문 처음으로 다시 감
				continue;
			}
			
			// 체크한 적 없는 컴퓨터인 경우
			// 체크한 컴퓨터 배열에 표시
			checked[curr.ed] = true;
			// 체크한 컴퓨터 개수 하나 증가
			cnt++;
			// 비용에 추가
			minCost += curr.cost;
			// 해당 컴퓨터와 연결된 간선들 정보를 우선순위 큐에 넣기
			// 넣는 순간 비용 기준으로 오름차순으로 정렬됨
			pq.addAll(adjList[curr.ed]); 
		}
		
		// 결과 출력
		System.out.println(minCost);
	}
}


// by SonMinji_220504 - Kruskal's Algorithm
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ1922re {
	
	// 각 컴퓨터가 이루고 있는 그룹(트리)의 대표를 저장한 배열
	static int[] parent;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 컴퓨터 개수 (1 <= N <= 1000)
		int N = sc.nextInt();
		// 연결할 수 있는 선의 수 (1 <= M <= 100,000)
		int M = sc.nextInt();
		// 간선 정보 저장할 배열
		// 0열, 1열 : 연결될 수 있는 두 컴퓨터의 번호
		// 2열 : 두 컴퓨터를 연결하는 데 드는 비용 
		int[][] edges = new int[M][3];
		// 간선 정보 
		for(int m=0; m<M; m++) {
			edges[m][0] = sc.nextInt();
			edges[m][1] = sc.nextInt();
			edges[m][2] = sc.nextInt();
		}
		// 간선 정보를 비용 기준으로 오름차순으로 정렬
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2]-o2[2];
			}
		});
		
		// 각 컴퓨터가 이루고 있는 그룹(트리)의 대표를 저장한 배열
		parent = new int[N+1];
		// 초기화  makeSet
		for(int i=1; i<=N; i++) {
			// 각 컴퓨터는 아직 연결된 선이 없기 때문에 본인이 본인 그룹의 대표
			parent[i] = i;
		}
		
		// 모든 컴퓨터 연결하는 데 드는 최소 비용
		int minCost = 0;
		// 선택한 간선의 개수 
		int pickCnt = 0;
		
		// 간선 배열이 비용 기준으로 오름차순으로 정렬되어있으니
		// 첫 행부터 간선 정보를 체크하여 간선을 선택하거나 선택하지 않음
		for(int m=0; m<M; m++) {
			// 연결될 수 있는 두 개의 컴퓨터가 속한 각 그룹의 대표 컴퓨터 번호를 찾음
			int px = findSet(edges[m][0]);
			int py = findSet(edges[m][1]);
			
			// 연결할 두 컴퓨터가 속한 그룹의 대표가 다를 경우
			// 대표가 같으면 이미 두 컴퓨터는 연결되어 있는 것이므로 연결할 필요가 없음
			if(px != py) {
				// 두 컴퓨터가 속한 그룹의 대표를 연결하여 두 컴퓨터가 같은 그룹에 있게 함
				union(px, py);
				// 선택한 간선의 개수 하나 증가
				pickCnt++;
				// 컴퓨터 연결하는 데 드는 비용 추가
				minCost += edges[m][2];
			}
			
			// 컴퓨터가 N개이므로 N-1개의 간선을 선택하면 
			// 모든 컴퓨터가 연결된 것이므로 반복문 종료
			if(pickCnt == N-1) {
				break;
			}
		}
		
		// 결과 출력
		System.out.println(minCost);
	}
	
	// x가 속한 그룹의 대표 찾기
	public static int findSet(int x) {
		if(parent[x] != x) { // x가 속한 그룹의 대표가 x가 아닐 경우
			// 재귀호출을 통하여 x가 속한 그룹의 대표를 찾아서 대표 저장 배열에 저장함 
			parent[x] = findSet(parent[x]);
		}
		return parent[x];
	}
	
	// x가 속한 그룹과 y가 속한 그룹 합치기
	public static void union(int x, int y) {
		// main 메서드에서 union 메서드 사용할 때 각 컴퓨터가 속한 그룹의 대표 번호를 넘겨주므로 
		// 그냥 y의 대표를 x로 저장해주면 두 그룹은 연결된 것
		parent[y] = x;
		// 만약 대표가 아니라 연결된 두 컴퓨터의 번호를 넘겨준다면
		// parent[findSet(y)] = parent[x]; 이렇게 작성하여
		// x가 속한 그룹의 대표를 y가 속한 그룹의 대표의 부모로 저장하여
		// y가 속한 그룹의 대표가 x가 속한 그룹의 대표와 같게 만듬
	}
	
}
*/
