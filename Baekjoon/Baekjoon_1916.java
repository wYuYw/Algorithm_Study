// 1916. 최소비용 구하기

// by SonMinji_220427

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1916 {
	// 출발 도시에서 도착 도시까지 가는 데 드는 최소 비용 출력하기
	
	static class Path implements Comparable<Path>{
		// 출발 도시 번호
		int st;
		// 도착 도시 번호
		int ed;
		// 버스 비용
		int cost;
		
		public Path(int st, int ed, int cost) {
			this.st = st;
			this.ed = ed;
			this.cost = cost;
		}

		// 우선 순위 큐에 입력 시 cost 기준으로 오름차순으로 정렬되게 하기 위해서
		@Override
		public int compareTo(Path o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) {
		// 값 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 도시 개수 (1 <= N <= 1,000)
		int N = sc.nextInt();
		// 버스 개수 (1 <= M <= 100,000)
		int M = sc.nextInt();
		// 버스 정보 저장할 리스트 배열
		List<Path>[] adjList = new ArrayList[N+1];
		// 초기화
		for(int i=0; i<N+1; i++) {
			adjList[i] = new ArrayList<>();
		}
		// 버스 정보 입력
		for(int m=1; m<=M; m++) {
			// 출발 도시의 번호
			int st = sc.nextInt();
			// 도착 도시의 번호
			int ed = sc.nextInt();
			// 버스 비용 (0 <= cost < 100,000)
			int cost = sc.nextInt();
			// 유향 그래프
			adjList[st].add(new Path(st, ed, cost));
		}
		
		// 구하고자 하는 구간 출발점의 도시 번호
		int searchST = sc.nextInt();
		// 구하고자 하는 구간 도착점의 도시 번호
		int searchED = sc.nextInt();
		
		// pq에 들어온 데이터를 searchST에서부터 각 도시까지 가는 데 드는 버스 비용(cost)을 기준으로
		// 오름차순으로 정렬하여 searchST에서 각 도시까지 가는 데 드는 최소 비용 구하기 위해 우선 순위 큐 사용
		PriorityQueue<Path> pq = new PriorityQueue<>();
		// 방문 유무 표시할 배열
		boolean[] visited = new boolean[N+1];
				
		// searchST부터 각 도시까지 가는 데 드는 최소 비용 저장할 배열
		int[] costArr = new int[N+1];
		// 최대값으로 초기화
		Arrays.fill(costArr, Integer.MAX_VALUE);
		// searchST에서 searchST까지 가는 최소 비용은 0
		costArr[searchST] = 0;
		// 출발할 도시와 방문할 도시 그리고 시작 도시(searchST)에서 방문할 도시까지 가는 데 드는 비용을 pq에 넣어줌
		// 경로 찾기 시작하는 거라서 시작 도시에서 시작 도시까지 가는 것부터 pq에 넣음
		pq.add(new Path(searchST, searchST, 0));
				
		while(!pq.isEmpty()) { // 큐가 다 빌때까지
			// 큐에서 이번에 방문할 도시 정보 들어있는 객체를 하나 꺼냄
			// 이번에 방문할 도시 번호는 객체의 ed에 해당하는 값
			Path curr = pq.poll();
			if(visited[curr.ed]) { // 방문하려고 했는데 방문한 적 있는 도시인 경우
				continue;
			}
			
			// 방문한 적 없는 도시인 경우
			// 방문 처리
			visited[curr.ed] = true;
			
			// 이번에 방문한 도시와 연결된 도시(방문할 도시) 체크하며 
			// searchST에서 방문할 도시까지 드는 비용을 지금까지 구해놓은 비용과 비교하여 
			// 더 적은 비용을 costArr배열에 저장
			for(Path p : adjList[curr.ed]) {
				// 조건 costArr[p.ed] > costArr[curr.ed]+p.cost에서 
				// curr.cost가 아니라 p.cost를 더해야 함  주의!
				if(!visited[p.ed] && costArr[p.ed] > costArr[curr.ed]+p.cost) {
					costArr[p.ed] = costArr[curr.ed]+p.cost;
					// 이번에 방문할 수 있었던 곳들을 pq에 넣음
					// pq는 cost 오름차순으로 정렬되므로
					// 방문할 수 있었던 곳들 중 costArr 배열에 저장된 값이 가장 작은 도시가 다음번에 뽑힘
					// 왜냐하면 더이상 searchST를 시작으로 뽑힌 애까지 가는 최단 경로는 없기 때문
					pq.add(new Path(p.st, p.ed, costArr[p.ed]));
				}
			}
		}
		
		// 결과 출력
		System.out.println(costArr[searchED]);
	}
}
