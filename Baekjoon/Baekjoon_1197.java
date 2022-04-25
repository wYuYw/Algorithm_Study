// 1197. 최소 스패닝 트리

// by SonMinji_220425

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
