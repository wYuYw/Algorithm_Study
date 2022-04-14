// 1260. DFS와 BFS

// by SonMinji_220415

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BJ1260 {

	// DFS 수행 결과 저장
	static StringBuilder DFSsb;
	// BFS 수행 결과 저장
	static StringBuilder BFSsb;
	// 각 정점의 방문 유무 체크할 배열
	static boolean[] visited;
	// 간선 정보 저장할 리스트배열
	static List<Integer>[] adjList;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정점의 개수 (1 <= N <= 1,000)
		// 정점 번호는 1~N
		int N = sc.nextInt();
		// 간선의 개수 (1 <= M <= 10,000)
		int M = sc.nextInt();
		// 탐색 시잘할 정점 번호
		int V = sc.nextInt();
		
		// 간선 정보 저장할 리스트배열 생성
		adjList = new ArrayList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			// 각 인덱스에 해당하는 배열 값을 리스트로 초기화
			adjList[i] = new ArrayList<>();
		}
		
		// 간선 정보 입력
		// 배열의 각 인덱스에 해당하는 리스트에 해당 정점에 연결된 정점 번호 저장
		for (int m = 1; m <= M; m++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			// 간선 양방향
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}

		// 연결된 정점 번호들을 오름차순으로 정렬
		for (int i = 0; i < N + 1; i++) {
			Collections.sort(adjList[i]);
		}

		// DFS 수행 결과 저장
		DFSsb = new StringBuilder();
		// 각 정점의 방문 유무 체크할 배열
		visited = new boolean[N + 1];
		// DFS 수행
		DFS(V, N);

		// BFS 수행 결과 저장
		BFSsb = new StringBuilder();
		// BFS 수행
		// 위 visited 배열 그대로 사용
		BFS(V);

		// 결과 출력
		// DFS 수행 결과
		System.out.println(DFSsb);
		// BFS 수행 결과
		System.out.println(BFSsb);
	}

	// DFS
	// V : 방문할 정점, N : 방문해야 할 정점 개수
	public static void DFS(int V, int N) {
		if (visited[V]) { // 방문한 적 있으면 메서드 종료
			return;
		}
		if (N == 0) { // 정점 N개 다 입력했으면 메서드 종료 
			return;
		}

		// recursive
		// 방문 처리
		visited[V] = true;
		// 방문한 값 입력
		DFSsb.append(V + " ");
		// 입력된 값과 연결된 오름차순으로 정렬된 정점들 방문
		// adjList[V]에 리스트 형식으로 연결된 정점 번호들 들어있음
		for (int i = 0; i < adjList[V].size(); i++) {
			DFS(adjList[V].get(i), N - 1);
		}
	}
	
	// BFS
	// V : 방문할 정점
	public static void BFS(int V) {
		Queue<Integer> q = new LinkedList<>();
		// 시작점 큐에 넣기
		q.add(V);
		// 방문 처리
		visited[V] = false;
		
		// 큐 빌 때까지 (큐가 비었다는 것은 더이상 방문할 정점이 없다는 것)
		while(!q.isEmpty()) {
			// 큐에서 정점 하나 빼기
			int v = q.poll();
			// 방문한 값 입력
			// 방문 유무 검사와 방문 처리는 큐에서 뺄 때가 아니라 큐에 넣을 때 해줌
			// 이렇게 하면 큐에 중복된 값이 들어가는 걸 방지하여 좀 더 효율적임
			BFSsb.append(v + " ");
			// v와 연결된 정점들을 큐에 다 넣어줌
			// adjList[v]에 리스트 형식으로 연결된 정점 번호들 들어있음
			for (int i = 0; i < adjList[v].size(); i++) {
				int vertex = adjList[v].get(i);
				if(visited[vertex]) { // 방문한 적 없는 경우 (배열 값이 true인 경우)
					// 큐에 정점 번호 넣기
					q.add(vertex);
					// 방문 처리
					// DFS()에서 1~N 인덱스에 해당하는 값이 다 true로 바뀌어 있으니
					// BFS()에서는 방문하면 false로 표시
					visited[vertex] = false;
				}
			}
		}
	}

}
