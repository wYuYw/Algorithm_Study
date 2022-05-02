// 1922. 네트워크 연결

// by SonMinji_220502

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
