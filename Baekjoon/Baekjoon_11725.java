// 11725. 트리의 부모 찾기

// by SonMinji_220424

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BJ11725 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 노드 개수 입력 (2 <= N <= 100,000)
		int N = sc.nextInt();
		// 노드의 부모 저장할 배열
		int[] edges = new int[N+1];
				
		// 간선 정보 저장할 리스트배열
		List<Integer>[] adjList = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			// 리스트로 값 저장할 수 있도록 초기화
			adjList[i] = new ArrayList<>();
		}
		// 연결되는 두 정점
		int num1, num2;
		for(int n=1; n<N; n++) { // N-1개의 간선 정보 입력
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			// 무향 그래프이므로 각 노드에 연결된 노드 번호를 추가
			adjList[num1].add(num2);
			adjList[num2].add(num1);
		}
		
		// 트리의 루트에서부터 연결된 노드를 파악해가며 각 노드의 부모를 알아내기 위해 큐 사용 (BFS)
		Queue<Integer> q = new LinkedList<>();
		// 트리의 루트를 1로 정한다고 문제에 나와있었고
		// 이 배열 값으로 방문 유무도 체크해 줄 것이므로
		// 노드 1의 부모는 1이라고 저장해줌
		edges[1] = 1;
		// 1이랑 연결된 노드 번호 모두 큐에 넣음
		q.addAll(adjList[1]);
		
		// q에는 부모가 누군지 알아내야 하는 노드의 번호가 입력되니까 q가 비었다는 것은
		// 모든 노드에 대해 부모가 누구인지 알아냈다는 것이므로 동작 종료
		while(!q.isEmpty()) {
			int curr = q.poll();
			for(int i=0; i<adjList[curr].size(); i++) {
				// 현재 가리키고 있는 노드와 연결된 노드 번호들 중 하나
				int adj = adjList[curr].get(i);
				if(edges[adj] != 0) { 
				// edges[adj] != 0 라는 것은 adj가 이미 부모가 누구인지 알고 있는 노드 번호이므로 
				// curr보다 루트에 가까운 노드를 의미함
					// adj는 curr과 연결되어 있으면서 curr보다 루트에 가까우니까
					// curr의 부모는 adj가 됨
					edges[curr] = adj;
				} else {
				// edges[adj] == 0 라는 것은 adj가 아직 부모가 누군지 모르는 노드 번호이고
				// curr보다 계층이 낮은 노드임
					// 해당 노드 번호는 q에 넣고 나중에 q에서 빼면서 부모가 누군지 알아냄
					q.add(adj);
				}
			}
		}
		
		// 결과 출력 (2번 노드부터 순서대로 각 노드의 부모 출력)
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<N+1; i++) {
			sb.append(edges[i]+"\n");
		}
		System.out.println(sb);
	}
}
